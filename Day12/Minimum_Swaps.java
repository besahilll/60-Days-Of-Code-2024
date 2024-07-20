class Complete{
    public static int minSwap (int arr[], int n, int k) {
        // Count elements less than or equal to k
        int countLessEqualK = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= k) {
                countLessEqualK++;
            }
        }
        
        //Count elements greater than k 
        int undesirableCount = 0;
        for (int i = 0; i < countLessEqualK; i++) {
            if (arr[i] > k) {
                undesirableCount++;
            }
        }
        
        int minSwaps = undesirableCount;
        
        for (int i = 0, j = countLessEqualK; j < n; i++, j++) {
            if (arr[i] > k) {
                undesirableCount--;
            }
            
            if (arr[j] > k) {
                undesirableCount++;
            }
            
            minSwaps = Math.min(minSwaps, undesirableCount);
        }
        
        return minSwaps;
    }
    
    
}
