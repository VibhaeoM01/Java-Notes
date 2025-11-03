import java.util.HashMap;

public class FirstNon {
     // Find First Non-Repeating Character
public static void main(String[] args) {
    
            String v="swiss";
        HashMap<Character,Integer> mp= new HashMap<>();
        for(char c : v.toCharArray())
        {
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        for(int i=0;i<v.length();i++)
        {
            if(mp.get(v.charAt(i)) == 1){
                 System.out.println(v.charAt(i));
                 break;
            }
        }
}
}
