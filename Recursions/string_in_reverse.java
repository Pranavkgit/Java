public class string_in_reverse {

    public static void ros(String s,int idx)
    {
        if(idx==-1)
        {
            return;
        }
        System.out.print(s.charAt(idx));
        ros(s,idx-1);
    }
    public static void main(String[] args)
    {
        String s="abcd";
        int idx=s.length()-1;
        ros(s,idx);
    }
    
}
