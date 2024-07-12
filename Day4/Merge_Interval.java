/*Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, 
and return an array of the non-overlapping intervals that cover all the intervals in the input.
Time:O(nlogn)
Space:O(n)*/
class Solution {
    public int[][] merge(int[][] intervals) {
		Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        Stack<int[]> stack=new Stack();
        stack.add(intervals[0]);

        for(int i=1;i<intervals.length;i++){
            int startpoint2=intervals[i][0];
            int endpoint2=intervals[i][1];

            int[] popArr=stack.pop();

            int startpoint1=popArr[0];
            int endpoint1=popArr[1];

            int endmaxpoint=Math.max(endpoint1,endpoint2);
            if(endpoint1>=startpoint2){
                int[] merge=new int[]{startpoint1,endmaxpoint};
                stack.add(merge);
            }else{
                stack.add(popArr);
                stack.add(intervals[i]);
            }
        }
        int[][] output=new int[stack.size()][2];
        for(int i=output.length-1;i>=0;i--){
            int[] popArr=stack.pop();
            output[i][0]=popArr[0];
            output[i][1]=popArr[1];
        }
        return output;
	}
}