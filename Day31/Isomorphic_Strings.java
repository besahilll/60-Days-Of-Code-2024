class Solution
{
    public static boolean areIsomorphic(String s,String t)
    {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character,Character > mpp = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if(!mpp.containsKey(original)){
                if(!mpp.containsValue(replacement)){
                    mpp.put(original,replacement);
                }else{
                    return false;
                }
            }else{
                char mapped = mpp.get(original);
                if(mapped!=replacement){
                    return false;
                }
            }
            
        }
        return true;
        
    }
}