public class middle_ll{
    Node head;
    int size=0;
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public void addlast(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
        }
        Node currnode=head;
        while(currnode.next!=null)
        {
            currnode=currnode.next;
        }
        currnode.next=newnode;
        newnode.next=null;
    }
    public void find(int middle)
    {
        if(head==null)
        {
            System.out.println("No data to find");
            return;
        }
        Node currnode=head;
        int cidx=-1;
        while(currnode!=null)
        {
            cidx++;
            if(cidx==middle)
            {
                System.out.println(currnode.data);
                return;
            }
            currnode=currnode.next;
        }
    }
    public static void main(String[] args)
    {
        middle_ll mid=new middle_ll();
        mid.addlast(1);
        mid.addlast(2);
        mid.addlast(3);
        mid.addlast(4);
        mid.addlast(5);
       mid.addlast(6);
        int middle=(mid.size)/2;
        mid.find(middle);
    }
}