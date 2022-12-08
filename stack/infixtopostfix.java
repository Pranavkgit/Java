import java.util.Stack;
public class infixtopostfix{

    public static int precedence(Character c)
    {
        if(c=='^')
        {
            return 3;
        }
        else if(c=='/' || c=='*')
        {
            return 2;
        }
        else if(c=='+' || c=='-')
        {
            return 1;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Stack<Character> s=new Stack<>();
        String infix="(a-b/c)*(a/k-l)";
        for(int i=0;i<infix.length();i++)
        {
            char c=infix.charAt(i);
            if(Character.isLetter(c))
            {
                System.out.print(c);
            }
            else if(c=='(')
            {
                s.push(c);
            }
            else if(!s.isEmpty() && c==')')
            {
                while(!s.isEmpty() && s.peek()!='(')
                {
                    System.out.print(s.pop());
                }
                if(!s.isEmpty())
                {
                    s.pop();
                }
            }
            else if(!s.isEmpty() && (precedence(c)>precedence(s.peek())))
            {
                s.push(c);
            }
            else{
                while(!s.isEmpty() && (precedence(c)<precedence(s.peek())))
                {
                    System.out.print(s.pop());
                }
                s.push(c);
            }
        }
        while(!s.isEmpty())
        {
            System.out.print(s.pop());
        }
    }
}