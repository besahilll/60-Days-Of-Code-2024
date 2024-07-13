/*Given an array of integers nums, find the next permutation of nums.
Time:O(n)
Space:O(1)*/
class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int k=n-2;
        //null checks
        if(nums.length==0 || nums==null)return;

        //find k 3142
        for(int i=n-1;i>0;i--){
            if(nums[i]<=nums[i-1]){
                k--;
            }else{
                break;
            }
        }
        //if k=-1 reverse the arr
        if(k==-1){
            reverse(nums,0,n-1);
            return;
        }else{
            //else replace k with next greater element
            for(int i=n-1;i>0;i--){
                if(nums[i]>nums[k]){
                    int temp=nums[k];
                    nums[k]=nums[i];
                    nums[i]=temp;
                    break;
                }
            }
            reverse(nums,k+1,n-1);
        }
    }

    public void reverse(int nums[], int s, int e){
        while(s<e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }
}