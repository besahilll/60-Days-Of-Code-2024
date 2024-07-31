//Given a string s and a dictionary of n words dictionary, find out if "s" can be segmented into a space-separated sequence of dictionary words.
Return 1 if it is possible to break the s into a sequence of dictionary words, else return 0.
class Solution
{
    public static int wordBreak(int n, String s, ArrayList<String> dictionary )
    {
        //code here
        HashSet<String> set=new HashSet <>();
        for(int i=0;i<dictionary.size();i++){
            set.add(dictionary.get(i));
        }
        boolean dp[]=new boolean[s.length()+1];
        boolean ans=isPossible(s,set,dp,0);
        if(ans){
            return 1;
        }else{
            return 0;
        }
    }
    public static  boolean isPossible(String s,HashSet<String> set,boolean dp[],int pos){
        if(pos==s.length()){
            return true;
        }
        if(dp[pos]!=false){
            return dp[pos];
        }
        String temp ="";
        for(int i=pos;i<s.length();i++){
            temp+=s.charAt(i);
            if(set.contains(temp)){
                if(isPossible(s,set,dp,i+1)){
                    return dp[i]=true;
                }
            }
        }
            return dp[pos];
        
    }
}