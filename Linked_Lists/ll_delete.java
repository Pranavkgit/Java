public class ll_delete {
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
    public void deleteidx(int idx)
    {
        if(head==null)
        {
            System.out.print("Nothing to delete");
            return;
        }
        Node prevnode=head;
        Node currnode=head.next;
        int idx1=1;
        while(currnode.next!=null)
        {
            if(idx==idx1)
            {
                prevnode.next=currnode.next;
                return;
            }
            idx1++;
            currnode=currnode.next;
            prevnode=prevnode.next;
        }
        if(idx==idx1)
            {
                prevnode.next=currnode.next;
                return;
            }
    }
    public void view()
        {
            if(head == null)
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
        ll_delete del=new ll_delete();
        del.addlast(0);
        del.addlast(1);
        del.addlast(2);
        del.addlast(3);
        del.view();
        del.deleteidx(2);
        del.view();
    }
    
}
