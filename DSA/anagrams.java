import java.util.Arrays;

public class anagrams {
    public static void main(String[] args) {
        String str1="Vibhaeo";
        String str2="Vihbeoa";
        String str3="Mudia";
        char [] s1=str1.toCharArray();
        char [] s2=str2.toCharArray();
        char [] s3=str3.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        Arrays.sort(s3);
        if(Arrays.equals(s1, s2))
        {
            System.out.println("same");
        }
        else{
            System.out.println("Not");
        }

        if(Arrays.equals(s1, s3))
        {
            System.out.println("same");
        }
        else{
            System.out.println("Not");
        }
    }
}
