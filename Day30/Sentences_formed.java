//Given a list of word lists of size  M * N. The task is to return all sentences possible taking one word from a list at a time via recursion. 
class Solution {
    public static ArrayList<ArrayList<String>> sentences(String[][] list) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        ArrayList<String> currentSentence = new ArrayList<>();
        
        generateSentences(list, 0, currentSentence, result);
        
        return result;
    }
    
    public static void generateSentences(String[][] list, int index, ArrayList<String> currentSentence, ArrayList<ArrayList<String>> result) {

        if (index == list.length) {
            result.add(new ArrayList<>(currentSentence));
            return;
        }
        
        for (int i = 0; i < list[index].length; i++) {
            currentSentence.add(list[index][i]);
            generateSentences(list, index + 1, currentSentence, result);
            currentSentence.remove(currentSentence.size() - 1);
        }
    }
}