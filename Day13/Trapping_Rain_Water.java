class Solution {
    static long trappingWater(int arr[], int n) {
        if (n <= 2) {
            return 0;  
        }

        // Arrays to store the maximum heights to the left and right of each block
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }

        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }

        // Calculate the total amount of trapped water
        long totalWater = 0;
        for (int i = 0; i < n; i++) {
            // Water trapped above block i is min(leftMax[i], rightMax[i]) - arr[i]
            totalWater += Math.max(0, Math.min(leftMax[i], rightMax[i]) - arr[i]);
        }

        return totalWater;
    }
}

