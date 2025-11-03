import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        StringBuilder sb1= new StringBuilder();
        StringBuilder sb2= new StringBuilder();
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                sb1.append('Y');
                sb2.append('X');
            }
            else{
                sb1.append('X');
                sb2.append('Y');
            }
        }
        int mini=Integer.MAX_VALUE;
        int check1=0;
        int check2=0;
        String s1=sb1.toString();
        String s2=sb2.toString();
        System.out.println(s1);
        System.out.println(s2);
        for(int i=0;i<n;i++)
        {
            if(s2.charAt(i)!=s.charAt(i)) check2++;
            if(s1.charAt(i)!=s.charAt(i)) check1++;
        }
        mini=Math.min(check1,check2);
        System.out.println(mini);
    } 
}
