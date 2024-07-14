class Solution {
    int getPairsCount(int[] arr, int sum) {
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int rem=sum-num;
            count+=map.getOrDefault(rem,0);
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        return count;
    }
}
