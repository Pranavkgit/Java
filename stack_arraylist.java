import java.util.ArrayList;
public class stack_arraylist{
    ArrayList<Integer> list=new ArrayList<>();
    public void push(int data)
    {
        list.add(data);
    }
    public void pop()
    {
        int top=list.size()-1;
        //int t=list.get(top);
        list.remove(top);
    }
    public void peek()
    {
        int top=list.size()-1;
        System.out.println(list.get(top));
    }
    public boolean isEmpty()
    {
        if(list.size()==0)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        stack_arraylist stack=new stack_arraylist();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        while(stack.isEmpty()==false)
        {
            stack.peek();
            stack.pop();
        }
    }
}