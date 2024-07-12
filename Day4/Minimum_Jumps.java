/*Given an array arr[] of size n of non-negative integers. Each array element represents the maximum length of the jumps that can be made forward from that element.
 This means if arr[i] = x, then we can jump any distance y such that y ≤ x.
Find the minimum number of jumps to reach the end of the array starting from the first element. If an element is 0, then you cannot move through that element.*/
class Solution {
    static int minJumps(int[] arr, int n) {
        int max=0;
        int maxRange=0;
        int jumps=0;
        
        if(n==1)return 0;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]+i);
            if(maxRange==i){
                maxRange=max;
                jumps++;
                if(maxRange>=n-1){
                    return jumps;
                }
            }
        }
        return -1;
    }
}