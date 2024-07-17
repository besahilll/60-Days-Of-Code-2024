class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int n)
	{
	   // add your code here
	   int max=1;
	   Arrays.sort(arr);
	   int count=1;
	   for(int i=1;i<n;i++){
	       if(1+arr[i-1]==arr[i]){
	           count++;
	           max=Math.max(max,count);
	       }else if(arr[i-1]==arr[i]){
	           continue;
	       }else{
	           count=1;
	       }
	   }
	   
	   return max;
	}
}