public class pattern_1{

    public static void main(String[] args)
    {
        int n=5;
        char[] arr=new char[26];
        int idx=0;
        for(int i=65;i<=90;i++)
        {
            char c=(char) i;
            arr[idx]=c;
            idx++;
        }
        //char fin=arr[n-1];
        for(int i=0;i<n;i++)
        {
            for(int j=n-1-i;j<=n-1;j++)
            {
                System.out.print(arr[j]+" ");
            }
            System.out.print("\n");
        }
    }
}