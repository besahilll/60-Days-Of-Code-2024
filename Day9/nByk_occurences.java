//find the count of elements in the array that appear more than n/k times.
class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
           hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        int c=0;
         for (Map.Entry<Integer,Integer> mapElement : hm.entrySet()) {
           if(mapElement.getValue()>n/k)
           {
               c++;
           }
        }
        return c;
        
    }
}