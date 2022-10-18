import java.util.*;
public class x_power_n{
    //stack==n;
    public static int pow(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(x==0)
        {
            return 0;
        }
        return x*pow(x,n-1);
    }
    //stack==logn
    public static int spow(int x,int n)
    {
        if(x==0)
        {
            return 0;
        }
        if(n==0)
        {
            return 1;
        }
        if(n%2==0)
        {
            return spow(x,n/2)*spow(x,n/2);
        }
        else{
            return spow(x,n/2)*spow(x,n/2)*x;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(spow(x,n));
    }
    
}