class Solution
{
    String secFrequent(String arr[], int N)
    {
        HashMap<String, Integer> hm=new HashMap<>();
        
        for(int i=0;i<N;i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }
        
        int max=Integer.MIN_VALUE;
        String str="";
        for(String key: hm.keySet()){
            if(hm.get(key)>max){
                max=hm.get(key);
                str=key;
            }
        }
        
        int max2=Integer.MIN_VALUE;
        String str2="";
        for(String key: hm.keySet()){
            if(hm.get(key)<max){
                if(hm.get(key)>max2){
                    max2=hm.get(key);
                    str2=key;
                }
            }
        }
        
        return str2;
        
    }
}