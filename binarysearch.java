import java.util.*;
public class binarysearch{
    public static void main(String[] args)
    {
        int[] arr={19,25,57,64,89};
        int find=89;
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(find>arr[mid])
            {
                start=mid+1;
            }
            if(find<arr[mid]){
                end=mid-1;
            }
            if(find==arr[mid])
            {
                System.out.print(mid);
                break;
            }
        }
    }
}