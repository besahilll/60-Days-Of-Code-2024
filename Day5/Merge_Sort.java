/*Time:
Space: */
class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         int[] merged=new int[r-l+1];
         int idx1=l; //iterator for left part
         int idx2=m+1;//iterator for right part
         int x=0;// iterator for merged arr
         while(idx1<=m && idx2<=r){
             if(arr[idx1]<=arr[idx2]){
                 merged[x]=arr[idx1];
                 x++;
                 idx1++;
             }else{
                 merged[x++]=arr[idx2++];
             }
         }
         
         //remaining left part
         while(idx1<=m){
             merged[x++]=arr[idx1++];
         }
         //remaining right part
         while(idx2<=r){
             merged[x++]=arr[idx2++];
         }
         
         for(int i=0, j=l; i<merged.length;i++, j++){
                arr[j]=merged[i];             
         }
    }
    void mergeSort(int arr[], int l, int r)
    {
        if(l>=r)return;
        int mid=l+(r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
        
    }
}
