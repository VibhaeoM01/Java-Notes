import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Freqcheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        HashMap<Character,Integer> mp= new HashMap<>();
        for(char c:s.toCharArray())
        {
            mp.put(c, mp.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> i:mp.entrySet())
        {   
            System.out.println(i.getKey()+" is key and value is "+i.getValue());
        }
    }
}
