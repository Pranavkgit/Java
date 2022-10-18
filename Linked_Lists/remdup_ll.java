public class remdup_ll {
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
    public void check()
    {
        if(head==null || head.next==null)
        {
            view();
            return;
        }
        Node prevnode=head;
        Node currnode=head.next;
        while(currnode!=null)
        {
            if(prevnode.data!=currnode.data)
            {
                prevnode=currnode;
                currnode=currnode.next;
                continue;
            }
            prevnode.next=currnode.next;
            currnode.next=null;
            currnode=prevnode.next;
        }
    }
    public static void main(String[] args)
    {
        remdup_ll rem=new remdup_ll();
        rem.addlast(2);
        rem.addlast(2);
        rem.addlast(2);
        rem.addlast(2);
        rem.view();
        rem.check();
        rem.view();
    }
    
}
