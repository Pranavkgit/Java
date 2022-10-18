public class merge_sort{

    public static void conquer(int[] arr,int s_i,int e_i,int mid)
    {
        int[] merged=new int[e_i-s_i + 1];
        int idx1=s_i;
        int idx2=mid+1;
        int idx3=0;
        while(idx1<=mid && idx2<=e_i)
        {
            if(arr[idx1]<=arr[idx2])
            {
                merged[idx3++]=arr[idx1++];
            }
            else{
                merged[idx3++]=arr[idx2++];
            }
        }
        while(idx1<=mid)
        {
            merged[idx3++]=arr[idx1++];
        }
        while(idx2<=e_i)
        {
            merged[idx3++]=arr[idx2++];
        }
        for(int i=0,j=s_i;i<merged.length;++i,++j)
        {
            arr[j]=merged[i];
        }
    }
    public static void divide(int[] arr,int s_i,int e_i)
    {
        if(s_i>=e_i){
            return;
        }
        int mid=(s_i+e_i)/2;
        divide(arr,s_i,mid);
        divide(arr,mid+1,e_i);
        conquer(arr,s_i,e_i,mid);
    }
    public static void main(String[] args)
    {
        int[] arr={6,3,9,5,2,8};
        int s_i=0;
        int e_i=arr.length-1;
        divide(arr,s_i,e_i);
        for(int i=0;i<arr.length;++i)
        {
            System.out.print(arr[i]+" ");
        }
    }
}