//Two sorted arrays array1 and array2 of size m and n respectively. Find the median of the two sorted arrays.
class GFG 
{ 
    static double medianOfArrays(int n1, int n2, int nums1[], int nums2[]) 
    {
       
        int n=n1+n2;
        int nums[]=new int[n];
        int k=0,j=0;
        int mid=0;
        double res=0;
        for(int i=0;i<n1;i++){
              nums[i]=nums1[k++];
        }
        for(int i=n1;i<n;i++){
            nums[i]=nums2[j++];
        }
        

        Arrays.sort(nums);
        mid=n/2;
        if(n%2==0){
            res=(nums[mid]+nums[mid-1])/2.0;
        }
        else{
            res=nums[mid];
        }
        return res;
    }
    
}