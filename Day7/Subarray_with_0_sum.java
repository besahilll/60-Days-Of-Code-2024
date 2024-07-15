class Solution{
    static boolean findsum(int arr[],int n)
    {
    
        HashSet<Integer> h = new HashSet<>();
        int sum = 0;
        for(int i =0;i<n;i++){
            if(arr[i]==0)
            return true;
            
            sum = sum+arr[i];
            
            if(h.contains(sum))
            return true;
            if(sum==0)
            return true;
            h.add(sum);
        }
        if(arr[0]+arr[1]==0)return true;
        return false;
    }
}