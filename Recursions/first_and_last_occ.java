public class first_and_last_occ {
    
    public static void fal(String s,int idx,int first,int last,char el)
    {
        if(idx==s.length())
        {
            System.out.print(first+" "+last);
            return;
        }
        char c=s.charAt(idx);
        if(c==el)
        {
            if(first==-1 && last==-1)
            {
                first=idx;
            }
            else{
                last=idx;
            }
        }
        fal(s,idx+1,first,last,el);
    }
    public static void main(String[] args)
    {
        String s="abaacdaefaah";
        int idx=0;
        int first=0;
        int last=s.length()-1;
        char el='a';
        fal(s,idx,first,last,el);
    }
}
