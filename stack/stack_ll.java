public class stack_ll {
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
        if(head==null)
        {
            return;
        }
        System.out.println(head.data);
        return;
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
        stack_ll stack=new stack_ll();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        while(!stack.isEmpty())
        {
            stack.peek();
            stack.pop();
        }
    }
}
