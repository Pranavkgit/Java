class color{
    public void disp1()
    {
        System.out.println("displaying...");
    }
}
class Car1 extends color{
    public void disp2(){
        System.out.println("inherited");
    }
}
class Car2 extends Car1{
    public void disp3()
    {
        System.out.print("multilevel..");
    }
}
class Car3 extends Car1{
    public void disp4()
    {
        System.out.println("hierarchical!");
    }
}
public class inheritance{
    public static void main(String[] args)
    {
        Car2 c2 = new Car2();
        c2.disp2();
    }
}