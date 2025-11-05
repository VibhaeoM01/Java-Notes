import java.util.Scanner;
public class amstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int m=n;
        while(n!=0)
        {
            int val=n%10;
            sum+=Math.pow(val,3);
            n=n/10;
        }
        System.out.println(sum);
        if(m==sum)
        {
            System.out.println("Yes");
        }
    }
}
