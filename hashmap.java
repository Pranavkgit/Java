import java.util.*;
public class hashmap{
    public static void main(String[] args)
    {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India",120);
        map.put("Us",35);
        map.put("Uk",5);
        // System.out.println(map);
        // if(map.containsKey("Indonesia"))
        // {
        //     System.out.println("key is present");
        // }
        // else{
        //     System.out.println("key is not present");
        // }
        // System.out.println(map.get("India"));
        // int [] arr={1,2,3};
        // for(int value:arr)
        // {
        //     System.out.println(value);
        // }
        for( Map.Entry<String,Integer> e : map.entrySet())
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }   
}