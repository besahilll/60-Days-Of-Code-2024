class Solution {
    static boolean ispar(String x) {
        Stack<Character> stack = new Stack<>();
        
        // Traverse the string.
        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // If the character is a closing bracket
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                
                // Check if the popped element matches the corresponding opening bracket.
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}
