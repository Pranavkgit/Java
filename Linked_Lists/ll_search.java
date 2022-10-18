public class ll_search {
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
    public void search(int data)
    {
        if(head==null)
        {
            System.out.println("No elements");
            return;
        }
        Node currnode=head;
        int idx=0;
        while(currnode.next!=null)
        {
            if(currnode.data==data)
            {
                System.out.println(idx);
                return;
            }
            currnode=currnode.next;
            idx++;
        }
        if(currnode.data==data)
        {
            System.out.println(idx);
            return;
        }
        else{
            System.out.println("Not found");
            return;
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
        ll_search linked=new ll_search();
        linked.addlast(0);
        linked.addlast(1);
        linked.addlast(2);
        linked.addlast(3);
        linked.addlast(4);
        linked.view();
        linked.search(3);
    }
    
}
