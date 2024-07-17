class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int n)
	{
	   int longest=1;
	   int last_smaller=Integer.MIN_VALUE;
	   int count=0;
	   Arrays.sort(arr);
	   for(int i=0;i<n;i++){
	       if(arr[i]-1==last_smaller){
	           count++;
	           last_smaller=arr[i];
	       }else if(arr[i]!=last_smaller){
	           count=1;
	           last_smaller=arr[i];
	       }
	       longest=Math.max(longest,count);
	   }
	   return longest;
	}
}