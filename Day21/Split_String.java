class Solution {
    public static int maxSubStr(String str) {
        int count0 = 0, count1 = 0;
        int maxCount = 0;

        for (int i = 0; i < str.length(); i++) {
            // Increment the respective counter
            if (str.charAt(i) == '0') {
                count0++;
            } else {
                count1++;
            }
            
            // Whenever the counts are equal, we found a balanced substring
            if (count0 == count1) {
                maxCount++;
            }
        }

        // If we have traversed the entire string and found balanced substrings
        if (count0 != count1) {
            return -1;
        }

        return maxCount;
    }
}