class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        ArrayList<Long> arr= new ArrayList<>();
        for(int x=0;x<n;x++)
        {
            
            arr.add(a1[x]);
        }
        
        for(int x=0;x<m;x++)
        {
            if(arr.contains(a2[x]))
            {
                arr.remove(Long.valueOf(a2[x]));
            }
            else
            {
                return "No";
            }
        }
        return "Yes";

        
    }
}