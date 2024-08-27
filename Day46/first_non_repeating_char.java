class Solution
{
    public String FirstNonRepeating(String A)
    {
        int[] frequency = new int[26];  
        Queue<Character> queue = new LinkedList<>();  
        StringBuilder result = new StringBuilder();  
        
        for (char ch : A.toCharArray()) {
            frequency[ch - 'a']++;
            
            queue.add(ch);
            
            // Check the front of the queue
            while (!queue.isEmpty() && frequency[queue.peek() - 'a'] > 1) {
                queue.poll();  
            }
            
            if (queue.isEmpty()) {
                result.append('#');
            } else {
                result.append(queue.peek());
            }
        }
        
        // Return the result string
        return result.toString();
    }
}