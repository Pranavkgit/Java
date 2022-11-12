public class stack_ll_reverse {
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
    public void push(int data)
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
    public void pop()
    {
        if(head==null)
        {
            return;
        }
        Node temp=head.next;
        head.next=null;
        head=temp;
    }
    public void peek()
    {
        System.out.println(head.data);
    }
    public void reverse()
    {
        Node prevnode=head;
        Node currnode=head.next;
        Node nextnode=head.next.next;
        while(currnode.next!=null)
        {
            currnode.next=prevnode;
            if(prevnode==head)
            {
                prevnode.next=null;
            }
            prevnode=currnode;
            currnode=nextnode;
            nextnode=nextnode.next;
        }
        currnode.next=prevnode;
        head=currnode;
    }
    public boolean isEmpty()
    {
        if(head==null)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        stack_ll_reverse s=new stack_ll_reverse();
        s.push(1);
        s.push(2);
        s.push(3);
        s.reverse();
        while(!s.isEmpty())
        {
            s.peek();
            s.pop();
        }

    }
}
