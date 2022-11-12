import java.util.Stack;
public class sorting {
    public static void tobottom(Stack<Integer> s,int data)
    {
        if(s.isEmpty() || data>s.peek())
        {
            s.push(data);
            return;
        }
        int top=s.pop();
        tobottom(s, data);
        s.push(top);
    }
    public static void sort(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            return;
        }
        int top=s.pop();
        sort(s);
        tobottom(s,top);
    }
    public static void main(String[] args)
    {
        Stack<Integer> s=new Stack<>();
        s.push(31);
        s.push(3);
        s.push(34);
        s.push(14);
        s.push(-3);
        sort(s);
        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
