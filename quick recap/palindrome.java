import java.util.Scanner;

public class palindrome{
    public static Boolean isPalindrome(int n)
    {
        int checkVariable=n;
        int reverseOfn=0;
        while(n!=0)
        {
            reverseOfn=(reverseOfn*10) + (n%10);
            n=n/10;
        }
        if(checkVariable==reverseOfn) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isPalindrome(n))
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}