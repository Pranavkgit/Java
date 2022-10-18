public class ll_insert {
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
    public void insert(int prevdata,int newdata)
    {
        Node newnode1=new Node(newdata);
        if(head==null)
        {
            head=newnode1;
            return;
        }
        Node currnode=head;
        while(currnode.next!=null)
        {
            if(currnode.data==prevdata)
            {
                Node temp=currnode.next;
                currnode.next=newnode1;
                newnode1.next=temp;
                return;
            }
            currnode=currnode.next;
        }
        if(currnode.data==prevdata)
        {
            Node temp=currnode.next;
            currnode.next=newnode1;
            newnode1.next=temp;
            return;
        }
        else{
            System.out.println("No prev data available");
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
        ll_insert insert=new ll_insert();
        insert.addlast(1);
        insert.addlast(2);
        insert.addlast(3);
        insert.addlast(4);
        insert.addlast(5);
        insert.view();
        insert.insert(3, 6);
        insert.view();
    }
}
