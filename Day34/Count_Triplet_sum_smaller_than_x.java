class Solution {
    long countTriplets(int n, int sum, long arr[]) {
        Arrays.sort(arr);
        long count = 0;

        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int k = n - 1;

            // Use two pointers to find suitable pairs
            while (j < k) {
                long currentSum = arr[i] + arr[j] + arr[k];

                if (currentSum < sum) {
                    // All elements from j to k will have a sum less than the given value
                    count += (k - j);
                    j++;
                } else {
                    k--;
                }
            }
        }
        return count;
    }
}
