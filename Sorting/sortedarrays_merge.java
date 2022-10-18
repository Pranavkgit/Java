public class sortedarrays_merge {
    
    public static void conquer(int[] arr1,int[] arr2,int s_i,int e_i)
    {
        int[] merged=new int[arr1.length*2];
        int idx1=s_i;
        int idx2=s_i;
        int idx3=0;
        while(idx1<=e_i && idx2<=e_i)
        {
            if(arr1[idx1]<=arr2[idx2])
            {
                merged[idx3++]=arr1[idx1++];
            }
            else{
                merged[idx3++]=arr2[idx2++];
            }
        }
        while(idx1<=e_i)
        {
            merged[idx3++]=arr1[idx1++];
        }
        while(idx2<=e_i)
        {
            merged[idx3++]=arr2[idx2++];
        }
        for(int i=0;i<merged.length;++i)
        {
            System.out.print(merged[i]+" ");
        }
        
    }
    public static void main(String[] args)
    {
        int[] arr1={1,2,4};
        int[] arr2={1,3,4};
        int s_i=0;
        int e_i=arr1.length-1;
        conquer(arr1,arr2,s_i,e_i);
        
    }
}
