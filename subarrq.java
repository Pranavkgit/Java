import java.util.*;
public class subarrq{
    public static void main(String[] args)
    {
        Queue<Integer> q= new LinkedList<>();
        int[] arr={10,20,30,40,50};
        int sub=1;
        for(int i=0;i<arr.length;i++)
        {
            q.add(arr[i]);
        }
        for(int i=0;i<sub;i++)
        {
            int front=q.peek();
            q.remove();
            q.add(front);
        }
        while(!q.isEmpty())
        {
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}