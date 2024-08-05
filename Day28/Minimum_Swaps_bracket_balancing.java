class Solution {
    static int minimumNumberOfSwaps(String S) {
        // code here
        int open = 0;
        int close = 0, swaps = 0;
        int unbalanced = 0, ans =0;
        
        for(int i=0; i<S.length(); i++) {
            char ch = S.charAt(i);
            if(ch == '[') {
                open++;
                if(unbalanced > 0) {
                    swaps += unbalanced;
                    unbalanced--;
                }
            }
            else{
                close++;
                unbalanced=close-open;
            }
        }
        return swaps;
    }
}