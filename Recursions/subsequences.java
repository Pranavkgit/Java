import java.util.HashSet;
public class subsequences {
    
    public static void subseq(String s,String n, int idx,HashSet<String> set)
    {   
        if(idx==s.length())
        {
            if(set.contains(n))
            {
                return;
            }
            else{
            System.out.println(n);
            set.add(n);
            }
            return;
        }
        char c=s.charAt(idx);
        subseq(s,n+c,idx+1,set);
        subseq(s,n,idx+1,set);

    }
    public static void main(String[] args)
    {
        String s="aaa";
        String n="";
        int idx=0;
        HashSet<String> set=new HashSet<>();
        subseq(s,n,idx,set);
    }
}
