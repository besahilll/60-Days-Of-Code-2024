class Solution{
    //Function to partition the array around the range such 
    //that array is divided into three parts.
     public void swap(int i, int j, int arr[]){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void threeWayPartition(int array[], int a, int b)
    {
        // code here 
        int low =0;
        int mid =0;
        int high = array.length-1;
        
        while(mid<=high){
   
            if(array[mid]<a){
                swap(low, mid, array);
                mid++;
                low++;
            }else if(array[mid]>b){
                swap(mid, high, array);
                high--;
            }else{
                mid++;
            }
        }
    }
}