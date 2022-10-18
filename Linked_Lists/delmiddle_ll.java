public class delmiddle_ll {
    int size;
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            size++;
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
    public void delete(int middle)
    {
        if(head==null || head.next==null)
        {
            System.out.println("NULL");
            return;
        }
        Node prevnode=head;
        Node currnode=head.next;
        int idx=0;
        while(currnode!=null)
        {
        if(idx==(middle-1))
        {
            prevnode.next=currnode.next;
            currnode.next=null;
            return;
        }
        idx++;
        prevnode=currnode;
        currnode=currnode.next;
    }
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
        delmiddle_ll del=new delmiddle_ll();
        del.addlast(1);
        del.addlast(2);
        del.addlast(3);
        del.addlast(4);
        del.addlast(5);
        del.addlast(6);
        del.view();
        int middle=del.size/2;
        del.delete(middle);
        del.view();
    }
}
