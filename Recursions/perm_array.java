import java.util.ArrayList;
public class perm_array {
   
    public static void perm(ArrayList<String> list,String n)
    {
        if(list.size()==0)
        {
            System.out.println(n);
            return;
        }
        for(int i=0;i<list.size();i++)
        {
            String s=list.get(i);
            ArrayList<String> temp=new ArrayList<>();
            for(int j=0;j<list.size();j++)
            {
                if(s!=list.get(j))
                {
                    temp.add(list.get(j));
                }
            }
            perm(temp,n+" "+s);
        }
    }
    public static void main(String[] args)
    {
        ArrayList<String> list=new ArrayList<>();
        list.add("aba");
        list.add("bbb");
        list.add("bab");
        String n="";
        perm(list,n);
    }
}
