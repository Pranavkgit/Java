public class x_toend{

    public static String xtoend(String s,String n,int idx,char el,int count)
    {
        if(idx==s.length())
        {
            for(int i=0;i<count;++i)
            {
                n+=el;
            }
            return n;
        }
        char c=s.charAt(idx);
        if(c==el)
        {
            count+=1;
        }
        else{
            n+=c;
        }
        return xtoend(s,n,idx+1,el,count);
    }
    public static void main(String[] args)
    {
        String s="axbcxxd";
        String n="";
        int idx=0;
        char el='x';
        int count=0;
       System.out.println(xtoend(s,n,idx,el,count));

    }
}