class Solution
{
	public static int kthSmallest(int[][]mat,int n,int k)
	{
        //code here.
       PriorityQueue<int []> minHeap = new PriorityQueue<>((a,b) -> a[0] - b[0]);
       for(int i =0 ; i< n ;i++){
           minHeap.add(new int[] {mat[i][0] , i ,0});
       }
       
       int[] kthSmallestElement = null;
       for(int i=0 ;i<k ;i++){
           kthSmallestElement = minHeap.poll();
           int row = kthSmallestElement[1];
           int col = kthSmallestElement[2];
           
           if(col + 1<n){
               minHeap.add(new int[]{mat[row][col+1],row,col+1});
           }
       }
       return kthSmallestElement[0];
        
    }
}