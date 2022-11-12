public class rotate_array{
    public static void main(String[] args)
    {
        int[] arr={10,20,30,40,50};
        int shift=1;
        int[] farr=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(i+shift>=arr.length)
            {
                farr[i+shift-arr.length]=arr[i];
            }
            else{
                farr[i+shift]=arr[i];
            }
        }
        for(int i=0;i<farr.length;i++)
        {
            System.out.print(farr[i]+" ");
        }
    }
}