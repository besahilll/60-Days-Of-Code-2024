class Solution {
    int isPalindrome(String S) {
        int n = S.length();
        for (int i = 0; i < n / 2; i++) {
            if (S.charAt(i) != S.charAt(n - i - 1)) {
                return 0; // Not a palindrome
            }
        }
        return 1; // Is a palindrome
    }
}
