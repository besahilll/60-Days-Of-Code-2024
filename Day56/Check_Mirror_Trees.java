class Solution {
    static int checkMirrorTree(int n, int e, int[] A, int[] B) {
        HashMap<Integer, Stack<Integer>> map = new HashMap<>();
        
        for (int i = 0; i < 2 * e; i += 2) {
            map.putIfAbsent(A[i], new Stack<>());
            map.get(A[i]).push(A[i + 1]);
        }

        for (int i = 0; i < 2 * e; i += 2) {
            if (map.get(B[i]).isEmpty() || map.get(B[i]).pop() != B[i + 1]) {
                return 0;
            }
        }
        
        return 1;
    }
};