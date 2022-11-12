import java.util.*;
public class arrays{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int not=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                System.out.print(i);
                not=1;
                break;
            }
            else{
                not=0;
            }
        }
        if(not==0)
        {
            System.out.print("No number found!");
        }
    }
}