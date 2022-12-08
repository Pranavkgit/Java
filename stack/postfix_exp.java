import java.util.Stack;
import java.lang.*;
public class postfix_exp {
    public static void main(String[] args)
    {
        Stack<Integer> s=new Stack<>();
        int operand1=0;
        int operand2=0;
        String post="46+2/5*7+";
        for(int i=0;i<post.length();i++)
        {
            char c=post.charAt(i);
            if(Character.isDigit(c))
            {
                s.push(c-'0');
            }
            else{
                operand2=s.pop();
                operand1=s.pop();
                switch(c)
                {
                    case '+':
                    s.push(operand1+operand2);
                    break;
                    
                    case '-':
                    s.push(operand1-operand2);
                    break;
                    
                    case '*':
                    s.push(operand1*operand2);
                    break;
                    
                    case '/':
                    s.push(operand1/operand2);
                    break;
                    
                    case '^':
                    s.push((int) Math.pow(operand1,operand2));
                    break;
                }
            }
        }
        System.out.println(s.peek());
    }
}
