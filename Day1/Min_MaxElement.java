/*find the minimum and maximum element in the array.
Time complexity: O(n) 
Space Complexity: O(1) *//
class Solution {
    public Pair<Long, Long> getMinMax(int[] arr) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return new Pair<>((long)min,(long)max);
    }
}