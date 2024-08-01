class Solution {
    int lps(String s) {
        int n = s.length();
        int[] lps = new int[n];
        
        int length = 0;
        int i = 1;
        
        lps[0] = 0;
        
        while (i < n) {
            if (s.charAt(i) == s.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = lps[length - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        
        return lps[n - 1];
    }
}