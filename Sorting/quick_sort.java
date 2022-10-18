public class quick_sort{

    public static int partition(int[] arr,int low,int high)
    {
        int t_idx=low-1;
        for(int i=low;i<high;i++)
        {
            if(arr[i]<arr[high])
            {
                t_idx++;
                int temp=arr[t_idx];
                arr[t_idx]=arr[i];
                arr[i]=temp;
            }
        }
        t_idx++;
        int temp=arr[t_idx];
        arr[t_idx]=arr[high];
        arr[high]=temp;
        return t_idx;
    }
    public static void qsort(int[] arr,int low,int high)
    {
        if(low<high)
        {
            int pi=partition(arr,low,high);
            qsort(arr,low,pi-1);
            qsort(arr,pi+1,high);
        }
    }
    public static void main(String[] args)
    {
        int[] arr={6,3,9,5,2,8};
        int low=0;
        int high=arr.length-1;
        qsort(arr,low,high);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}