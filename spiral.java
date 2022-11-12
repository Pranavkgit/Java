import java.util.*;
public class spiral{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int row_start=0;
        int row_end=row-1;
        int col_start=0;
        int col_end=col-1;
        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        while(row_start<=row_end && col_start<=col_end)
        {
            for(int i=col_start;i<=col_end;i++)
            {
                System.out.print(arr[row_start][i]+" ");
            }
            row_start++;
            for(int i=row_start;i<=row_end;i++)
            {
                System.out.print(arr[i][col_end]+" ");
            }
            col_end--;
            for(int i=col_end;i>=col_start;i--)
            {
                System.out.print(arr[row_end][i]+" ");
            }
            row_end--;
            for(int i=row_end;i>=row_start;i--)
            {
                System.out.print(arr[i][col_start]+" ");
            }
            col_start++;
        }
    }
}