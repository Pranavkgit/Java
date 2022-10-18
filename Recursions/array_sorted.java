public class array_sorted{

    public static boolean sorted(int[] arr,int idx)
    {
        if(idx==arr.length-1)
        {
            return true;
        }
        if(arr[idx]<arr[idx+1])
        {
            return sorted(arr,idx+1);
        }
        return false;
    }
    public static void main(String[] args)
    {
        int[] arr={1,2,10,3,4,5};
        int idx=0;
        System.out.println(sorted(arr,idx));
    }
}