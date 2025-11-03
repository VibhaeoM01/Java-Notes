class Overriding
{
    public void method(int a)
    {
        System.out.println("Overriding");
    }   
}
public class Over extends Overriding {
    @Override
    public void method(int a)
    {   
        System.out.println(a+"a");
    }
    public void method(int a,int b)
    {
        System.out.println(a+"a and b"+b);
    }
    public static void main(String[] args) {
        Over o= new Over();
        o.method(10);
        o.method(10,12);
    }
}
