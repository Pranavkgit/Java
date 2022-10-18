public class TowerofHanoi {
    
    public static void toh(int n,String source,String helper,String destination)
    {
        if(n==1)
        {
            System.out.println(source+"to"+destination);
            return;
        }
        toh(n-1,source,destination,helper);
        System.out.println(source+"to"+destination);
        toh(n-1,helper,source,destination);
    }
    public static void main(String[] args)
    {
        int n=1;
        String source="S";
        String helper="H";
        String destination="D";
        toh(n,source,helper,destination);
    }
}
