import java.util.HashSet;

public class Q19 {
    public static void main(String[] args) {
        String s = "aabbbccdeeea";
        Boolean check=false;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            check = false;
            while (i < s.length() - 1 && s.charAt(i) == s.charAt(i+1)) {
                i++;
                check = true;
            }
            if (check) sb.append('#');
            else sb.append(s.charAt(i));
        }
        String ans=sb.toString();
        sb.setLength(0);
        for(int i=0;i<ans.length();i++)
        {
            check=false;
            while(i<ans.length()-1 && ans.charAt(i)==ans.charAt(i+1))
            {
                i++;
                check=true;
            }
            if(check)
            {
                sb.append('#');
            }
            else{
                sb.append(ans.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
