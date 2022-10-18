public class printnumber_1to5{

    public static void view(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
       // System.out.println(n);
        view(n-1);
        System.out.println(n);
    }
    public static void main(String[] args)
    {
        view(5);
    }
}