import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class vowel_consonant {
    // Since static Belongs to class, not to any object


    // public static Boolean IsVowel(char c)
    // {
    //     c=Character.toLowerCase(c);
    //     if(vowels.contains(c))
    //     {
    //         return true;
    //     }
    //     return false;
    // }





    // In Java, the main() method is static, so it can only access other static members directly.
    // to use non static,
            //public class Demo {
            //     int x = 10;

            //     public static void main(String[] args) {
            //         Demo obj = new Demo();   // ✅ create object
            //         System.out.println(obj.x); // ✅ access instance variable
            //     }
            // }
    public static void main(String[] args) {
        
      Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        String s="Vibhaeo";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            // if(!IsVowel(s.charAt(i)))
            // {
            //     sb.append(s.charAt(i));
            // }
            char c=s.charAt(i);
            c=Character.toLowerCase(c);
            if(vowels.contains(c))
            {
                sb.append(s.charAt(i)); 
            } 
        }
        System.out.println(sb.toString());
    }
}
