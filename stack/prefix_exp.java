import java.util.Stack;
import java.lang.Math;
public class prefix_exp{
    public static void main(String[] args)
    {
        Stack<Integer> s=new Stack<>();
        String prefix="-+7*45+20";
        int operand1=0;
        int operand2=0;
        for(int i=prefix.length()-1;i>=0;i--)
        {
            char c=prefix.charAt(i);
            if(Character.isDigit(c))
            {
                s.push(c-'0'); 
            }
            else{
                operand1=s.pop();
                operand2=s.pop();
                switch (c)
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