//Given an array arr. Your task is to find the elements whose value is equal to that of its index value ( Consider 1-based indexing).
class Solution {
    public List<Integer> valueEqualToIndex(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
    
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == i + 1) {
                result.add(i + 1);
            }
        }
        
        return result;
    }
}
