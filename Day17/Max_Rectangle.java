class Solution {
    public int maxArea(int mat[][], int n, int m) {
        int ans=0;
		int a[]=new int[m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(mat[i][j]==1){
					a[j]++;
				}
				else{
					a[j]=0;
				}
			}
			int area =largestRectangleArea(a);
			ans=Math.max(ans, area); 
		}
		return ans;
    }
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        Stack<Integer> stk = new Stack<>();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            while (!stk.isEmpty() && arr[stk.peek()] > arr[i]) {
                int ind = stk.pop();
                int nse = i;
                int pse = stk.isEmpty() ? -1 : stk.peek();
                ans = Math.max(ans, arr[ind] * (nse - pse - 1));
            }
            stk.push(i);
        }
        while (!stk.isEmpty()) {
            int ind = stk.pop();
            int nse = n;
            int pse = stk.isEmpty() ? -1 : stk.peek();
            ans = Math.max(ans, arr[ind] * (nse - pse - 1));

        }
        return ans;
    }
}
