import java.util.HashMap;
import java.util.Map;
public class VowelsConsonants {
    public static boolean check(char c) {
        c = Character.toLowerCase(c); // handle uppercase
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    public static void main(String[] args) {
        String s="Vibhaeo";
        // int cnt=0; 
        StringBuilder str= new StringBuilder(s);
        int i=0, r=str.length();
        while(i<r)
        {
            if(check(str.charAt(i)) && check(str.charAt(r)))
            {
                char c1=str.charAt(i);
                char c2=str.charAt(r);
                str.setCharAt(i, c2);
                str.setCharAt(r, c1);
            }
            i++;
            r--;
        }
        s=str.toString();
        System.out.println(s); 
        // char temp=s.charAt(1);
        // s.charAt(1)=s.charAt(4);
        // char temp=carr[1];
        // carr[1]=carr[4];
        // carr[4]=temp;
        // for(char i:s.toCharArray())
        // {
        //     if(Character.isLetter(i))
        //     {
        //         if(check(i)) cnt++;
        //     }
        // }
        // System.out.println(cnt);
        // System.out.println(s.length()-cnt);
    }
}
