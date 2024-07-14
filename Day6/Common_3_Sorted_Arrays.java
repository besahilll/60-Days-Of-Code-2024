//You are given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        int i=0;
        int j=0;
        int k=0;
        
        List<Integer> res=new ArrayList<>();
        while(i<arr1.size() && j<arr2.size() && k<arr3.size()){
            int val1=arr1.get(i);
            int val2=arr2.get(j);
            int val3=arr3.get(k);
            
            if(val1<val2){
                i++;
            }else if(val1>val2)j++;
            else{
                //this is for checking duplicate elements
                if(i>0 && val1==arr1.get(i-1)){
                    i++;
                    continue;
                }
                while(k<arr3.size() && (arr3.get(k))<val2)k++;
                if(k<arr3.size() && arr3.get(k)==val2){
                    res.add(val2);
                }
                i++;j++;
            }
        }
        return res;
    }
}