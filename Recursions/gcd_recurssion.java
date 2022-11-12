public class gcd_recurssion{

    public static int gcd(int x,int y)
    {
        if(x==y)
        {
            return x;
        }
        int res=0;
        if(x>y)
        {
            res=x-y;
            return gcd(res,y);
        }
        else if(x<y)
        {
            res=y-x;
            return gcd(res,x);
        }
        return gcd(x,y);
    }
    public static void main(String[] args)
    {
        System.out.println(gcd(42,24));
    }
}