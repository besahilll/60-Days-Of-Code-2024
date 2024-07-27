class Solution {
    String removeDuplicates(String str) {
        
        LinkedHashSet<Character> seen = new LinkedHashSet<>();
        
        for (char ch : str.toCharArray()) {
            seen.add(ch);
        }
        
        
        StringBuilder result = new StringBuilder();
        for (char ch : seen) {
            result.append(ch); 
        }
        
        return result.toString(); 
    }

    // For testing purposes
    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "HelloWorld";
        System.out.println(solution.removeDuplicates(str)); 
    }
}
