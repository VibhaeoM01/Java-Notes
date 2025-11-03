import java.util.Map;
import java.util.HashMap;

public class Q15 {
    public static void main(String[] args) {
        String s="ACABABCCA";
        Map<Character,Integer>mp1= new HashMap<>();
        Map<Integer,Integer>mp2= new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            mp1.put(s.charAt(i),mp1.getOrDefault(s.charAt(i),0)+1);
        }
        for(char c:mp1.keySet())
        {
            int val=mp1.get(c);
            mp2.put(val, mp2.getOrDefault(val,0)+1);
        }
        int ans=0;
        int maxi=Integer.MIN_VALUE;
        for(int val:mp2.keySet())
        {
            if(maxi<mp2.get(val))
            {
                ans=val;
                maxi=mp2.get(val);
            }
        }
        System.out.println(ans);
    }
}
