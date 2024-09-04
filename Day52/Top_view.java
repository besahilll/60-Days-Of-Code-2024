/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    class Pair  {
     int hl;
     Node node;
    Pair(Node node, int hl) {
      this.hl=hl;
      this.node=node;
    }
   }
   
   private void width(Node root, int hori, int arr[]) {
       if(root==null) return ;
       
       arr[0]=  Math.min(arr[0],hori);
       arr[1]=  Math.max(arr[1],hori);
       
       width(root.left,hori-1,arr);
       width(root.right,hori+1,arr);
   }
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
      ArrayList<Integer> topView(Node root) {
        // add your code
        ArrayList<Integer> ans = new ArrayList<>();
        int arr[]= {0,0};
        width(root,0,arr);
        
        LinkedList<Pair> q= new LinkedList<>();
        q.add(new Pair(root,Math.abs(arr[0])));
        int total= arr[1]-arr[0]+1;
        
        for(int i=0;i<total;i++)
        ans.add(null);
        
        while(!q.isEmpty()) {
            int size=q.size();
         
         while(size-- > 0)  {
           Pair pr= q.removeFirst();
           Node node= pr.node;
           int level= pr.hl;
           
           if(ans.get(level)==null) 
           ans.set(level,node.data);
           
           if(node.left!=null)
           q.add(new Pair(node.left,level-1));
           
           if(node.right!=null)
           q.add(new Pair(node.right,level+1));
         }
       }
       
       return ans;
    }
}