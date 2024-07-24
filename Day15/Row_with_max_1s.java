//Given a boolean 2D array, consisting of only 1's and 0's, where each row is sorted. Find the 0-based index of the first row that has the maximum number of 1's. Return the 0-based index of the first row that has the most number of 1s. If no such row exists, return -1.
class Solution {
    public int rowWithMax1s(int arr[][]) {
        int n = arr.length;    
        int m = arr[0].length; 
        
        int maxRowIndex = -1;  
        int j = m - 1;         
        for (int i = 0; i < n; i++) {
            while (j >= 0 && arr[i][j] == 1) {
                j--;
                maxRowIndex = i;
            }
        }
        return maxRowIndex;
    }
}
