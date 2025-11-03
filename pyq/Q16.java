import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int bfuel = sc.nextInt();
        int sfuel = sc.nextInt();
        sc.close();
        int mbusses=(p+(80-1))/80;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<=mbusses;i++)
        {
            int rem=p-(i*80);  
            if(rem<0) continue;
            int shuttles=((rem+7)/8); 
            mini=Math.min(mini,(i * bfuel * 75)+(shuttles * sfuel * 75));
        }
        System.out.println(mini); 
    }
}
