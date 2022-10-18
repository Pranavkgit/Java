public class add1_ll {
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
    public void solve(Node head)
    {
        int carry=0;
        if(head==null)
        {
            return;
        }
        if(head.next==null)
        {
            if(head.data<=8)
            {
                head.data+=1;
                return;
            }
            if(head.data==9)
            {
                head.data=0;
                Node newnode=new Node(1);
                head.next=newnode;
                return;
            }
        }
        Node currnode=head;
        Node prevnode=head; 
        while(currnode!=null)
        {
            if(currnode.data==9)
            {
                currnode.data=0;
                carry=1;
            }
            else if(currnode.data==9 && carry==1)
            {
                currnode.data=0;
                carry=1;
            }
            else if(currnode.data<=8 && carry==1)
            {
                currnode.data+=1;
                carry=0;
            }
            currnode=currnode.next;
        }
        if(carry==1)
        {
            Node newnode=new Node(1);
            while(prevnode.next!=null)
            {
                prevnode=prevnode.next;
            }
            prevnode.next=newnode;
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
            add1_ll add=new add1_ll();
            //add.addlast(1);
            add.addlast(9);
            //add.addlast(9);
           // add.addlast(9);
            add.view();
            add.head=add.reverse(add.head);
            add.view();
            add.solve(add.head);
            add.view();
            add.head=add.reverse(add.head);
            add.view();
        }
}
