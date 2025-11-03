import java.util.LinkedHashMap;

public class Q8{
    public static void main(String[] args) {
        String s="she is good grid god and ground player plotter";
        String [] strarr=s.split("\\s+");
        LinkedHashMap<String,Integer>mp=new LinkedHashMap<>();
        for(int i=0;i<strarr.length;i++)
        {
            String check=strarr[i];
            StringBuilder sb = new StringBuilder();
            sb.append(check.charAt(0));
            sb.append(check.charAt(check.length()-1));
            String put=sb.toString();
            mp.put(put,mp.getOrDefault(put, 0)+1);
        }
        StringBuilder sb=new StringBuilder();
        int maxi = Integer.MIN_VALUE;
        for(String c:mp.keySet())
        {
            maxi=Math.max(maxi,mp.get(c));
        }
        for(String c:mp.keySet())
        { 
            if(mp.get(c)==maxi) sb.append(c);
        }
        System.out.println(sb.toString());
    }
}