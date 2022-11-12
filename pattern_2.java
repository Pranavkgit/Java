public class pattern_2{
    public static void main(String[] args)
    {
        // int n=5;
        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=n;j>=1;j--)
        //     {
        //         if(i==j)
        //         {
        //             System.out.print("*");
        //         }
        //         else{
        //         System.out.print(j);
        //         }
        //     }
        //     System.out.print("\n");
        // }
        //5438
int max=Integer.MIN_VALUE;
int n=5438;
String s=Integer.toString(n);
int[] arr=new int[s.length()];
int idx=arr.length-1;
while(n>0)
{
    int rem=n%10;
    arr[idx]=rem;
    idx--;
    n=n/10;
}
int mul=0;
for(int i=0;i<arr.length;i++)
{
    for(int j=0;j<arr.length;j++)
    {
        if(i==j)
        {
            continue;
        }
        else{
            mul=mul*10+arr[j];
        }
    }
    if(mul>max)
    {
        max=mul;
    }
    mul=0;
}
System.out.println(max);
    }
}
