import java.util.HashMap;
import java.util.Map;

public class Q9 {
    public static void main(String[] args) {
        String s="101"; 
        // HashMap<Integer,Integer>mp=new HashMap<>();
        int cnt=0;
        for(int i=0;i<s.length();i++)
        {
            int val=s.charAt(i)-'0';
            if(val!=0) cnt++;
        }
        for(int i=0;i<s.length()-1;i++)
        {
            int val=0;        
            val=(s.charAt(i)-'0')*10+(s.charAt(i+1)-'0');
            System.out.println(val);   
            if(val<26 && val>9)
            {
                cnt++;
                // mp.put(val,mp.getOrDefault(val, 0)+1);
            }
        }
        // int cnt=0;
        // for(int it:mp.keySet())
        // {
        //     cnt+=mp.get(it);
        // }
        System.out.println(cnt);
    }
}

      
