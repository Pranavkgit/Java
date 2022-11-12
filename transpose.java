import java.util.*;
public class transpose{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] arr=new int[row][col];      
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++){
                if(i==j)
                {
                    continue;
                }
                else if(i<j && i!=j){
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}