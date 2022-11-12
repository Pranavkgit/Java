import java.util.ArrayList;

import java.util.ArrayList;
public class reversestring {
    
    ArrayList<Character> list=new ArrayList<>();

    public void push(char c)
    {
        list.add(c);
    }
    public void pop()
    {
        int top=list.size()-1;
        list.remove(top);
    }
    public void peek()
    {
        int top=list.size()-1;
        System.out.print(list.get(top));
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
        reversestring stack=new reversestring();
        String s="PranaV";
        for(int i=0;i<s.length();i++)
        {
            stack.push(s.charAt(i));
        }
        while(!stack.isEmpty())
        {
            stack.peek();
            stack.pop();
        }
    }
}
