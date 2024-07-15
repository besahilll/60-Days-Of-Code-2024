//Create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.
class Solution {
    
    public static void rotate(int[] arr, int start, int end) {
        int temp = arr[end];
        for (int i = end - 1; i >= start; i--) {
            arr[i + 1] = arr[i];
        }
        arr[start] = temp;
    }

    void rearrange(int arr[], int n) {
        int posIndex = 0, negIndex = 0; // Track positions for positive and negative numbers
        
        // Step through the array with index `k`
        for (int k = 0; k < n; k++) {
            if (k % 2 == 0) {
                // Even index should have positive number
                if (arr[k] < 0) {
                    posIndex = k + 1;
                    while (posIndex < n && arr[posIndex] < 0) {
                        posIndex++;
                    }
                    if (posIndex >= n) break;
                    rotate(arr, k, posIndex);
                }
            } else {
                // Odd index should have negative number
                if (arr[k] >= 0) {
                    negIndex = k + 1;
                    while (negIndex < n && arr[negIndex] >= 0) {
                        negIndex++;
                    }
                    if (negIndex >= n) break;
                    rotate(arr, k, negIndex);
                }
            }
        }
    }

}