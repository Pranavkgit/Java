import java.util.Stack;
public class infixtoprefix {
    public static int precedence(Character c)
    {
        if(c=='^')
        {
            return 3;
        }
        if(c=='/' || c=='*')
        {
            return 2;
        }
        if(c=='+' || c=='-')
        {
            return 1;
        }
        return -1;
    }
    public static String reverses(String s)
    {
        String n="";
        for(int i=s.length()-1;i>=0;i--)
        {
            char c=s.charAt(i);
            if(c=='(')
            {
                n+=')';
            }
            else if(c==')')
            {
                n+='(';
            }
            else{
                n+=c;
            }
        }
        return n;
    }
    public static void main(String[] args)
    {
        Stack<Character> s=new Stack<>();
        String infix="(a-b/c)*(a/k-l)";
        String rin=reverses(infix);
        String pre="";
        System.out.println(rin);
        for(int i=0;i<rin.length();i++)
        {
            char c=rin.charAt(i);
            if(Character.isLetter(c))
            {
                pre+=c;
            }
            else if(c=='(')
            {
                s.push(c);
            }
            else if(c==')')
            {
                while(!s.isEmpty() && s.peek()!='(')
                {
                    pre+=s.pop();
                }
                if(!s.isEmpty())
                {
                    s.pop();
                }
            }
            else if(!s.isEmpty() && precedence(c)>precedence(s.peek()))
            {
                s.push(c);
            }
            else 
            {
                while(!s.isEmpty() && precedence(c)<precedence(s.peek()))
                {
                    pre+=s.pop();
                }
                s.push(c);
            }
            
        }
        while(!s.isEmpty())
        {
            pre+=s.pop();
        }
        System.out.print(reverses(pre));
    }
}
