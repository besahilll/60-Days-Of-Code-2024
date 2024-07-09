/*find the kth smallest element in the array.
Time complexity: O(n+klogn)
Space Complexity: O(1)*/
class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        PriorityQueue<Integer> maxh=new PriorityQueue<>(Collections.reverseOrder()); //Defining maxheap
        
        for(int i=l;i<=r;i++){
            maxh.add(arr[i]);
            if(maxh.size()>k){
                maxh.poll();
            }
        }
        return maxh.peek();
        
    } 
}

