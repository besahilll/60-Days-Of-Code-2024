/*Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
Time Complexity: O(n)
Space Complexity:O(1)
*/
class Solution {
    public void sortColors(int[] nums) {
        int count_0=0, count_1=0, count_2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count_0++;
            }
            else if(nums[i]==1){
                count_1++;
            }
            else{
                count_2++;
            }
        }
        for(int i=0;i<count_0;i++){
            nums[i]=0;
        }
        for(int i=count_0;i<count_0 + count_1;i++){
            nums[i]=1;
        }
        for(int i=count_1 + count_0 ;i<nums.length;i++){
            nums[i]=2;
        }
    }
}