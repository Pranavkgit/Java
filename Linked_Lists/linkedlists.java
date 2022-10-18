public class linkedlists {
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
        public void addfirst(int data)
        {
            Node newnode=new Node(data);
            if(head==null)
            {
                head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;
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
        public void deletefirst()
        {
            if(head == null)
            {
                System.out.println("No data");
                return;
            }
            head=head.next;
        }
        public void deletelast()
        {
            if(head == null)
            {
                System.out.println("No data");
                return;
            }
            Node currnode=head.next;
            Node prevnode=head;
            while(currnode.next!=null)
            {
                Node temp=currnode;
                currnode=currnode.next;
                prevnode=temp;
            }
            prevnode.next=null;
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
            linkedlists ll=new linkedlists();
            ll.addlast(0);
            ll.addlast(1);
            ll.addlast(2);
            ll.view();
            ll.deletefirst();
            ll.view();
            ll.addfirst(0);
            ll.view();
        }
}
