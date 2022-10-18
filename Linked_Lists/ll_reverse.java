public class ll_reverse {
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
    public void reverse()
    {
        if(head==null || head.next==null)
        {
            return;
        }
        Node prevnode=head;
        Node currnode=head.next;
        Node nextnode=head.next.next;
        while(nextnode!=null)
        {
            Node temp=currnode.next;
            currnode.next=prevnode;
            prevnode=currnode;
            currnode=temp;
            nextnode=nextnode.next;
        }
        currnode.next=prevnode;
        head.next=null;
        head=currnode;
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
        ll_reverse rev=new ll_reverse();
        rev.addlast(0);
        rev.addlast(1);
        rev.addlast(2);
        rev.addlast(3);
        rev.addlast(4);
        rev.addlast(5);
        rev.view();
        rev.reverse();
        rev.view();
    }
    
}
