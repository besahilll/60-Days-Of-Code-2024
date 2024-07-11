/*Given an integer array arr[]. Find the contiguous sub-array(containing at least one number) that has the maximum sum and return its sum.
Time: O(n^3)
Space: O(1)*/
class Solution {
    long maxSubarraySum(int[] arr) {

        long max=Integer.MIN_VALUE;
        long currSum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currSum=0;
                for(int z=i;z<=j;z++){
                    currSum+=arr[z];
                }
                if(max<currSum){
                    max=currSum;
                }
            }
        }
        return max;
    }
}
