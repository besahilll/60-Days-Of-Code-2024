class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        int mini = Integer.MAX_VALUE;
        int n=arr.length;
        for(int i=0; i<n; i++){
            int count = 0, j=i, sum = 0;
            while(j<n && sum<=x){
                sum += arr[j++];
                count++;
            }
            if(sum > x){
                mini = Math.min(mini,count);
            }
           
        }
        return mini==Integer.MAX_VALUE?0:mini;
    }
}
