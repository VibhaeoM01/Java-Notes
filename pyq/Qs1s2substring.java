import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Qs1s2substring{
    public static void main(String[] args) {
        String s1="abcde";
        String s2="bcdeab";
        int k=2;
        Set<String> st = new HashSet<>();
        for(int i=0;i<=s1.length()-k;i++)
        {
            st.add(s1.substring(i,i+k));
        }    
        int cnt=0;
        for(int i=0;i<=s2.length()-k;i++)
        {
             String check=s2.substring(i,i+k);
            if(st.contains(check)) { 
                cnt++;
            }
        }
        System.out.println(cnt);
        Map<Character,Integer>mp=new HashMap<>();
        for(int i=0;i<s2.length();i++)
        {
            mp.put(s2.charAt(i),mp.getOrDefault(s2.charAt(i),0)+1);
        }
        for(char c:mp.keySet())
        {
            System.out.println(c+" "+mp.get(c));
        }
    }
}