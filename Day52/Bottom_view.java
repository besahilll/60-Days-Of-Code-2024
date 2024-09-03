class Pair{
    Node node;
    int level;
    int pos;
    Pair(Node node,int level,int pos){
        this.node = node;
        this.level = level;
        this.pos = pos;
    }
}

class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        ArrayList<Pair> right = new ArrayList<>();
        ArrayList<Pair> left = new ArrayList<>();
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0,0));
        
        while(!q.isEmpty()){
            Pair curr = q.remove();
            if(curr.pos>=0){
                if(curr.pos == right.size()){
                    right.add(curr);
                }else{
                    if(curr.level>right.get(curr.pos).level){
                        right.set(curr.pos,curr);
                    }
                }
            }else{
                int pos = Math.abs(curr.pos);
                if(pos > left.size()){
                    left.add(curr);
                }else{
                    if(curr.level > left.get(pos-1).level){
                        left.set(pos-1,curr);
                    }
                }
            }
            
            if(curr.node.right!=null){
                q.add(new Pair(curr.node.right,curr.level+1,curr.pos+1));
            }
            if(curr.node.left!=null){
                q.add(new Pair(curr.node.left,curr.level+1,curr.pos-1));
            }
        }
        Collections.reverse(left);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<left.size();i++){
            ans.add(left.get(i).node.data);
        }
        for(int i=0;i<right.size();i++){
            ans.add(right.get(i).node.data);
        }
        return ans;
    }
}