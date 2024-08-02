class Sol {
    int countRev(String s) {
        int len = s.length();
        
        if (len % 2 != 0) return -1;
        
        int open = 0, close = 0;
        
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            
            if (ch == '{') {
                open++;
            } else {
                if (open == 0) {
                    close++;
                } else {
                    open--;
                }
            }
        }
        
        int reversals = (open + 1) / 2 + (close + 1) / 2;
        
        return reversals;
    }
}
