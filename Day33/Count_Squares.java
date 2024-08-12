class Solution {
    static int countSquares(int N) {
        // Calculate the largest integer x such that x^2 < N
        int x = (int)Math.sqrt(N - 1);
        return x;
    }
}
