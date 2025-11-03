class Rect{
    private double l,w;
    Rect()
    {
        this.l=1;
        this.w=1;
    }
    public void set(int l,int w)
    {
        if(l>1)
            this.l=l;
        else
            System.out.println("Length must be positive");
        
        if(w>1)
            this.w=w;
        else
            System.out.println("Width must be positive");
    }
    public void get()
    {
        System.out.println(l*w);
    }
}


public class oop4 {
    public static void main(String[] args) {
        Rect re=new Rect();
        re.set(10,3);
        re.get();
    }
}
