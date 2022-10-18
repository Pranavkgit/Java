public class ll_revrecursive {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void addlast(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            return;
        }
        Node currnode=head;
        while(currnode.next!=null)
        {
            currnode=currnode.next;
        }
        currnode.next=newnode;
        newnode.next=null;
    }
    public Node reverse(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node newhead=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
    }
    public void view()
    {
        if(head==null)
        {
            System.out.println("No data");
            return;
        }
        Node currnode=head;
        while(currnode.next!=null)
        {
            System.out.print(currnode.data+"-->");
            currnode=currnode.next;
        }
        System.out.print(currnode.data+"-->"+"NULL");
        System.out.print("\n");
    }
    public static void main(String[] args)
    {
        ll_revrecursive rev=new ll_revrecursive();
        rev.addlast(0);
        rev.addlast(1);
        rev.addlast(2);
        rev.addlast(3);
        rev.addlast(4);
        rev.view();
        rev.head=rev.reverse(rev.head) ;
        rev.view();
    }
    
}
