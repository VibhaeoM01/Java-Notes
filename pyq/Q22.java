import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        String s="Apple:250:10;Banana:120:15;Orange:300:5";
        // Scanner c= new Scanner(System.in);
        // String s=c.nextLine();
        int sum=0;
        String [] each=s.split(";");
        for(String seach:each)
        {
            String [] eeach=seach.split(":");
            sum+=Integer.parseInt(eeach[1])*Integer.parseInt(eeach[2]);
        }
        System.out.println(sum);
    }
}
//👉 So yes: the largest value in the sequence must not exceed n – 1.