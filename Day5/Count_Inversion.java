class Solution {
    static long merge(long arr[], int l, int m, int r)
    {
         long[] merged=new long[r-l+1];
         int idx1=l; //iterator for left part
         int idx2=m+1;//iterator for right part
         int x=0;// iterator for merged arr
         long count=0;
         while(idx1<=m && idx2<=r){
             if(arr[idx1]<=arr[idx2]){
                 merged[x]=arr[idx1];
                 x++;
                 idx1++;
             }else{
                 count+=(m-idx1+1);
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
         return count;
    }
    static long mergeSort(long arr[], int l, int r)
    {
        long count=0;
        if(l>=r)return count;
        int mid=l+(r-l)/2;
        count+=mergeSort(arr,l,mid);
        count+=mergeSort(arr,mid+1,r);
        count+=merge(arr,l,mid,r);
        return count;
        
    }
    static long inversionCount(long arr[], int n) {
        return mergeSort(arr,0,n-1);
    }
}