import java.util.Scanner;

public class fact {
    
    public static int fact(int n)
    {
        if(n==0 || n==1) return n;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        // int ans=1;
        // for(int i=1;i<=n;i++)
        // {
        //     ans*=i;
        // }
        // System.out.println(ans);
        int fin=fact(n);
        System.out.println(fin);
    }
}
