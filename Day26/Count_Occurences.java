class Solution
{
    public int findOccurrence(char mat[][], String word)
    {
        int count = 0;
        boolean[][] visited = new boolean[mat.length][mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == word.charAt(0)) {
                    count += find(mat, word, visited, i, j, 0);
                }
            }
        }

        return  count;
    }
      public int find(char mat[][], String word, boolean vis[][], int r, int c, int index) {
        if (r < 0 || c < 0 || r == vis.length || c == vis[0].length || vis[r][c] || word.charAt(index) != mat[r][c]) 
            return 0;
        
        if (index == word.length() - 1) 
            return 1; 

        vis[r][c] = true;
        int top = find(mat, word, vis, r - 1, c, index + 1);
        int down = find(mat, word, vis, r + 1, c, index + 1);
        int right = find(mat, word, vis, r, c + 1, index + 1);
        int left = find(mat, word, vis, r, c - 1, index + 1);
        vis[r][c] = false;

        return top + down + right + left;    
    }
}