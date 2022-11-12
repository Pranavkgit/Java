public class sub_strings{

    public static void substrings(String s,String e)
    {
        if(s.length()==0)
        {
            System.out.println(e);
            return;
        }
        char c=s.charAt(0);
        substrings(s.substring(1),e);
        substrings(s.substring(1),e+c);
    }
    public static void main(String[] args)
    {
        String s="abc";
        String e=" ";
        substrings(s,e);
    }
}