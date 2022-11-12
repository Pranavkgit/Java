import java.util.Stack;
public class sort_tempstack {

    public static void sort(Stack<Integer> s,Stack<Integer> temp)
    {
        while(!s.isEmpty())
        {
            int top=s.pop();
            if(temp.isEmpty())
            {
                temp.push(top);
            }
            else if(!temp.isEmpty() && top>temp.peek())
            {
                temp.push(top);
            }
            else if(!temp.isEmpty() && top<temp.peek())
            {
                s.push(temp.pop());
                s.push(top);
            }
            
        }
    }
    public static void main(String[] args)
    {
        Stack<Integer> s=new Stack<>();
        Stack<Integer> temp=new Stack<>();
        s.push(34);
        s.push(3);
        s.push(31);
        s.push(98);
        s.push(92);
        s.push(23);
        sort(s,temp);
        while(!temp.isEmpty())
        {
            System.out.println(temp.peek());
            temp.pop();
        }
    }
}
