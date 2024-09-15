class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    public int numTrees(int n) {
        return numTreesUtil(n);
        
    }
    
    int numTreesUtil(int n) {
        if(n <= 1) {
            return 1;
        }
        
        if(map.containsKey(n)) {
            return map.get(n);
        }
        
        int result = 0;
        for(int i=0; i<n; i++) {
            int left = numTreesUtil(i);
            int right = numTreesUtil(n-i-1);
            result += left * right;
        }
        
        map.put(n, result);
        
        return result;
    }
}