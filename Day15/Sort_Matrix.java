class Solution {
    public int[][] sortedMatrix(int N, int Mat[][]) {
        // Step 1: Flatten the matrix into a single array
        int[] temp = new int[N * N];
        int k = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                temp[k++] = Mat[i][j];
            }
        }
        
        // Step 2: Sort the array
        Arrays.sort(temp);
        
        // Step 3: Convert the sorted array back to a matrix
        k = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                Mat[i][j] = temp[k++];
            }
        }
        
        return Mat;
    }
}