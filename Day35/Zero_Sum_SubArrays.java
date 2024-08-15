class Solution {
    public static long findSubarray(long[] arr, int n) {
        HashMap<Long, Integer> sumMap = new HashMap<>();
        long cumulativeSum = 0;
        long count = 0;
        sumMap.put(0L, 1);
        for (int i = 0; i < n; i++) {
            cumulativeSum += arr[i];
            
            if (sumMap.containsKey(cumulativeSum)) {
                count += sumMap.get(cumulativeSum);
            }
            
            sumMap.put(cumulativeSum, sumMap.getOrDefault(cumulativeSum, 0) + 1);
        }
        
        return count;
    }
}