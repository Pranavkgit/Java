class car{
    String name;
    int speed;
    public void dispinfo(String name)
    {
        this.name=name;
        System.out.println(this.name);
    }
    public void dispinfo(int speed)
    {
        this.speed=speed;
        System.out.println(this.speed);
    }    
    public void dispinfo(String name, int speed)
    {
        this.name=name;
        this.speed=speed;
        System.out.println(this.name);
        System.out.println(this.speed);
    }
}
public class polymorphism{
    public static void main(String[] args)
    {
        car c1=new car();
        c1.dispinfo("Audi");
    }
}