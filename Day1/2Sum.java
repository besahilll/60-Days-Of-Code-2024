/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
Time Complexity: O(n) 
Space Complexity: O(1)*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> map=new HashMap<>();

        //Fill Hashmap
       for(int i=0;i<nums.length;i++){
        map.put(nums[i],i);
       }

        //Search Hashmap
       for(int i=0;i<nums.length;i++){
        int num=nums[i];
        int rem=target-num;
        if(map.containsKey(rem)){
            int index=map.get(rem);
            if(index==i)continue;
            return new int[]{i,index};
        }
       }
       return new int[]{};
    }
}
