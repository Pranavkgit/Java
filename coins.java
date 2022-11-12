import java.util.*;
public class coins{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int one=0,two=0,five=0;
        five=(n-4)/5;
        if((n-5*five)%2==0)
        {
            one=2;
        }
        else
        {
            one=1;
        }
        two=(n-5*five-one)/2;
        System.out.println(one+two+five);
    }
}