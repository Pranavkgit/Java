import java.util.*;
public class fibanocci_till_nth {

    public static int fib(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

    public static void pfib(int a,int b,int n)
    {

        if(n==0)
        {
            return;
        }
        int c=a+b;
        System.out.println(c);
        pfib(b,c,n-1);

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fib(n));
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        pfib(a,b,n-2);
    }
    
}
