/*Given an integer array arr[]. Find the contiguous sub-array(containing at least one number) that has the maximum sum and return its sum.
Time: O(n^2)
Space: O(1)*/
class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int[] arr) {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int[] prefixArr=new int[arr.length];
        prefixArr[0]=arr[0];
        //calculate prefix array
        for(int i=1;i<arr.length;i++){
            prefixArr[i]=prefixArr[i-1]+arr[i];
        }
        
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                currSum= start==0? prefixArr[end] : prefixArr[end]-prefixArr[start-1];
                
                if(currSum>maxSum){
                    maxSum=currSum;
                }
            }
        }
        return maxSum;
        
    }
}
