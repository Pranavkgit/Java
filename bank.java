class info{
    String name;
    String email;
    private String password="1234";

    public void dispname(String name)
    {
        this.name=name;
        System.out.println(this.name);
    }
    protected void dispemail(String email)
    {
        this.email=email;
        System.out.println(this.email);
    }
   
    public void getpassword()
    {
        System.out.println(this.password);
    }
    public void setpassword(String p)
    {
        this.password=p;
    }
}

public class bank{
    public static void main(String[] args)
    {
        info i1=new info();
        i1.dispname("pranav");
        i1.dispemail("prm@gmail.com");
        i1.getpassword();
        i1.setpassword("pranaV");
        i1.getpassword();
    }    
}