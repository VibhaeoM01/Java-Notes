import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Anagrams {
    public static void main(String[] args) {
        String s="silent";
        String t="isenlt";

        //Sorting and comparing

        // char [] s1=s.toCharArray();
        // char [] t1=t.toCharArray();
        // Arrays.sort(s1);
        // Arrays.sort(t1);
        // s = new String(s1);
        // t=new String(t1);
        // if(s.equals(t)) System.out.println("yes");
        // else System.out.println("no");


        //Freq array
        int [] count= new int[26];
        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int i:count)
        {
            if(i!=0)
            {
                System.out.println("NO");
                System.exit(0);
            }
        }
        System.out.println("Yes");

       
    }
}
