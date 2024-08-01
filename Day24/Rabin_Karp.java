class Solution
{
    
    ArrayList<Integer> search(String pattern, String text)
    {
        // your code here
         ArrayList<Integer>list=new ArrayList<>();
         
         int l=0,i=0;
         
         while(true)
         {
             
             l=text.indexOf(pattern,i);
             
             if(l==-1)
             break;
             
             else
             {
             list.add(l+1);
             i=l+1;
             }
             
         }
         
        return list;
    }
}