/*Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.
Time Complexity:O(N)*/
class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int n)
	{
	  int longest=1;
	  int count=0;
	  HashSet<Integer> set=new HashSet<>();
	  for(int i=0;i<n;i++){
	      set.add(arr[i]);
	  }
	  
	  for(int it:set){
	      if(!set.contains(it-1)){ //if it is a starting point
	          //find consecutive no.
	          count=1;
	          int x=it;
	          while(set.contains(x+1)){
	              x=x+1;
	              count++;
	          }
	          longest=Math.max(longest,count);
	      }
	  }
	  return longest;
	}
}