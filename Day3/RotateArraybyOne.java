/*rotate the array by one position in clock-wise direction.
Time: O(n) 
Space:O(1)*/
class Solution {
    public void rotate(int[] arr) {
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }
}