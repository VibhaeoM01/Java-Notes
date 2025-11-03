class Calc{
    public int add(int a,int b)
    {
        return a+b;
    }
    public int sub(int a,int b)
    {
        return Math.abs(a-b);
    }
};

public class Oop1 {

    public static void main(String[] args) {
        Calc c=new Calc();
        System.out.println(c.add(1,3));
        System.out.println(c.sub(1,3));
    }
}
