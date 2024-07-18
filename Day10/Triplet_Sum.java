class Solution {
    public static boolean find3Numbers(int arr[], int n, int x) {

        // Your code Here
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++)
        {
            int j = i+1, k = n-1;
            int sum=0;
            while(j < k){
                sum = arr[i]+arr[j]+arr[k];
                if(sum == x)
                    return true;
                else if(sum > x){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return false;
    }
}