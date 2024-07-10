class Solution {
    public static int doUnion(int arr1[], int arr2[]) {
        int max=Integer.MIN_VALUE;
        
        //calculate maximum value in both arrays
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>max)max=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]>max)max=arr2[i];
        }
        
        int count=0;
        int[] freq=new int[max+1];
        
        //fill frequency array
        for(int i=0;i<arr1.length;i++){
            freq[arr1[i]]++;
        }
        for(int i=0;i<arr2.length;i++){
            freq[arr2[i]]++;
        }
        
        //count the elements
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                count++;
            }
        }
        
        return count;
    }
}