public class permutations{

    public static void perm(String s,String n)
    {
        if(s.length()==0)
        {
            System.out.println(n);
            return;
        }
        for(int i=0;i<s.length();i++)
        {
            char p=s.charAt(i);
            String news=s.substring(0,i)+s.substring(i+1);
            perm(news,n+p);
        }
    }
    public static void main(String[] args)
    {
        String s="abc";
        String n="";
        perm(s,n);
    }
}