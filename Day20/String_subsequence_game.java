class Solution {
    static void f(int idx,String ans,String s,TreeSet<String> set,TreeSet<Character> vowel){
        if(idx==s.length()){
            if(ans.length()>1 && vowel.contains(ans.charAt(0)) && 
            !vowel.contains(ans.charAt(ans.length()-1))){
                set.add(ans);
                return;
            }
            return;
        }
        
        f(idx+1,ans+s.charAt(idx),s,set,vowel);
        f(idx+1,ans,s,set,vowel);
    }
    static TreeSet<String> allPossibleSubsequences(String s) {
        // code here
        TreeSet<Character> vowel = new TreeSet<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');vowel.add('o');vowel.add('u');
        TreeSet<String> set = new TreeSet<>();
        f(0,"",s,set,vowel);
        return set;
        
    }
}