public class removeduplicates{

    public static void remove(String s,int idx,boolean[] arr)
    {
        if(idx==s.length())
        {
            return;
        }
        char c=s.charAt(idx);
        int x=c-'a';
        if(arr[x]==false)
        {
            System.out.print(c);
            arr[x]=true;
        }
        remove(s,idx+1,arr);
    }
    public static void main(String[] args)
    {
        String s="abbccda";
        int idx=0;
        boolean[] arr=new boolean[26];
        remove(s,idx,arr);
    }
}