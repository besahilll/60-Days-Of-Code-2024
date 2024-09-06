class Solution
{
    public static Node buildTree(int inorder[], int preorder[], int n)
    {
        // code here 
        return build(inorder,preorder,0,0,n);
    }
    public static Node build(int inorder[],int preorder[],int inS,int preS,int n){
        if(n==0){
            return null;
        }
        Node ret=new Node(preorder[preS]);
        int i=find(inorder,inS,preorder[preS]);
        ret.left=build(inorder,preorder,inS,preS+1,i);
        ret.right=build(inorder,preorder,inS+i+1,preS+i+1,n-i-1);
        return ret;
    }
    public static int find(int arr[],int s,int tar){
        int i=0;
        while(arr[s+i]!=tar) i++;
        return i;
    }
}