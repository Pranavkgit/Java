import java.util.ArrayList;  
import java.util.Collections;
public class arraylists{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<String>  list2= new ArrayList<String>();
        // ArrayList<Boolean> list3= new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(20);
        System.out.println(list);
       int element = list.get(2);
       System.out.println(element);
       list.add(1,1);
       System.out.println(list);
       list.set(2,2);
       System.out.println(list);
       list.remove(3);
       System.out.println(list);

    //    for(int i=0;i<list.size();i++)
    //    {
    //     System.out.print(list.get(i)+" ");
    //    }
    list.add(15);
    list.add(5);
    System.out.println(list);
    Collections.sort(list);
    System.out.println(list);
    }
}