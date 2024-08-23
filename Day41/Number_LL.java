class Solution {
    // Function to add two numbers represented by linked list.
    static Node reverse(Node n){
        Node prev=null;
        Node curr=n;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    static Node addTwoLists(Node num1, Node num2) {
        // code here
        // return head of sum list
        num1=reverse(num1);
        num2=reverse(num2);
        Node result=null;
        Node temp=null;
        int carry=0;
        
        while(num1!=null || num2!=null || carry>0){
            int sum=carry;
            if(num1!=null){
                sum=sum+num1.data;
                num1=num1.next;
            }
            if(num2!=null){
                sum=sum+num2.data;
                num2=num2.next;
            }
            carry=sum/10;
            sum=sum%10;
            
            Node newN=new Node(sum);
            if(result==null){
                result=newN;
                temp=result;
            }else{
                temp.next=newN;
                temp=temp.next;
            }
        }
        return reverse(result);
        
    }
}