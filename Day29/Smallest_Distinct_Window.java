class Solution {
    public int findSubString(String str) {
        int n = str.length();
        if (n == 0) return 0;
        
        HashSet<Character> uniqueChars = new HashSet<>();
        for (char c : str.toCharArray()) {
            uniqueChars.add(c);
        }
        int unique_count = uniqueChars.size();
        
        HashMap<Character, Integer> charCount = new HashMap<>();
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        int count = 0;  
        
        for (int end = 0; end < n; end++) {
            char endChar = str.charAt(end);
            charCount.put(endChar, charCount.getOrDefault(endChar, 0) + 1);
            
            if (charCount.get(endChar) == 1) {
                count++;
            }
            
            while (count == unique_count) {
                minLength = Math.min(minLength, end - start + 1);
                
                char startChar = str.charAt(start);
                charCount.put(startChar, charCount.get(startChar) - 1);
                
                if (charCount.get(startChar) == 0) {
                    count--;
                }
                
                start++;
            }
        }
        
        return minLength;
    }
}
