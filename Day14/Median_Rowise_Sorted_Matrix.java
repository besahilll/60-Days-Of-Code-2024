//Given a row wise sorted matrix of size R*C where R and C are always odd, find the median of the matrix.
class Solution {
    int median(int matrix[][], int R, int C) {
        // Finding the minimum and maximum element
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < R; i++) {
            min = Math.min(min, matrix[i][0]);
            max = Math.max(max, matrix[i][C - 1]);
        }
        
        int desired = (R * C + 1) / 2;
        while (min < max) {
            int mid = min + (max - min) / 2;
            int place = 0;
            
            // count of elements less than or equal to mid
            for (int i = 0; i < R; i++) {
                place += upper_bound(matrix[i], mid);
            }
            
            if (place < desired) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }
        
        return min;
    }
    
    // Helper function to find the number of elements less than or equal to mid
    int upper_bound(int[] row, int mid) {
        int low = 0;
        int high = row.length;
        
        while (low < high) {
            int midIdx = low + (high - low) / 2;
            if (row[midIdx] <= mid) {
                low = midIdx + 1;
            } else {
                high = midIdx;
            }
        }
        
        return low;
    }
}
