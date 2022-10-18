public class bubble_sort {
    
    public static void main(String[] args)
    {
        //int[] arr={1,5,3,2,0};
        int[] arr={2, 8, 1, 3, 6, 7, 5, 4};
        int count=1;
        while(count<arr.length)
        {
            for(int i=0;i<arr.length-count;++i)
            {
                if(arr[i]>arr[i+1])
                {
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            count++;
        }
        for(int i=0;i<arr.length;++i)
        {
            System.out.print(arr[i]);
        }
    }
}
