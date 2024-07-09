/*find the kth smallest element in the given array.
Time Complexity: O(nlogn)
Space Complexity: O(1) */
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}