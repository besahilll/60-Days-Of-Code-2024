class Solution {
    public String helper(Node root, List<Node> res, HashMap<String, Integer> mp){
        if(root == null){
            return "#";
        }
        String temp = Integer.toString(root.data)+" "+helper(root.left, res, mp)+" "+helper(root.right, res, mp);
        if(mp.get(temp)!=null && mp.get(temp)==1){
            res.add(root);
        }
        mp.put(temp, mp.getOrDefault(temp, 0)+1);
        return temp;
    }
    public List<Node> printAllDups(Node root) {
        List<Node> res = new ArrayList<>();
        HashMap<String, Integer> mp = new HashMap<>();
        helper(root, res, mp);
        return res;
    }
}