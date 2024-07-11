//minimum possible difference between the height of the shortest and tallest towers after you have modified each tower.
class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        
        //base condition
        if(n==1) return 0;
        Arrays.sort(arr);
        
        int Min=arr[0]+k;
        int Max=arr[n-1] -k;
        int result=arr[n-1]-arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]-k<0)continue;
             Min=Math.min(arr[0]+k,arr[i]-k);
             Max=Math.max(arr[n-1]-k,arr[i-1]+k);
             result=Math.min(result,Max-Min);
        }
        
        return result;
    }
}