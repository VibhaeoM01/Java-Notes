class seriescalc{
    public int calc(int a,int d,int n)
    {
        return ((n * (2 * a + (n - 1) * d)) / 2);
    }
}


public class Oop3{
    public static void main(String[] args) {
        seriescalc seriescalc= new seriescalc();
        System.out.println(seriescalc.calc(1,2,5));
    }
}