/*Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Time: O(n) 
Space:O(1)*/
class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        //example: arr={1,2,3,7,8,9}
        reverse(nums,0,nums.length-1);//arr={9,8,7,3,2,1}
        reverse(nums,0,k-1);//arr={7,8,9,3,2,1}
        reverse(nums,k,nums.length-1);//arr={7,8,9,1,2,3}
    }
    public void reverse(int[] nums,int start, int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}