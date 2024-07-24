//Given an m x n matrix, find all common elements present in all rows in O(mn) time and one traversal of matrix.
import java.util.*;

class Solution {
    public static void findCommonElements(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        Map<Integer, Integer> elementCount = new HashMap<>();
        for (int j = 0; j < n; j++) {
            elementCount.put(mat[0][j], 1);
        }
        for (int i = 1; i < m; i++) {
            Map<Integer, Integer> tempMap = new HashMap<>();
            for (int j = 0; j < n; j++) {
                // If the element is present in the elementCount map and not already counted for this row
                if (elementCount.containsKey(mat[i][j]) && elementCount.get(mat[i][j]) == i) {
                    // Increment the count in the tempMap
                    tempMap.put(mat[i][j], i + 1);
                }
            }
            // Update the elementCount map 
            for (Map.Entry<Integer, Integer> entry : tempMap.entrySet()) {
                elementCount.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<Integer, Integer> entry : elementCount.entrySet()) {
            if (entry.getValue() == m) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }

    public static void main(String[] args) {
        int mat[][] = {
            {1, 2, 1, 4, 8},
            {3, 7, 8, 5, 1},
            {8, 7, 7, 3, 1},
            {8, 1, 2, 7, 9},
        };

        findCommonElements(mat);
    }
}
