import java.util.*;

public class substring {
    public static void main(String[] args) {
        int k=2;
        String s1="ababcde";
        String s2="bcabefgh";
        Set<String> st= new HashSet<>();
        for(int i=0;i<s1.length()-k;i++)
        { 
            st.add(s1.substring(i, i + k)); 
        }
        int cnt=0;
        for(String i:st){
            if(s2.contains(i)) cnt++;
        }
        System.out.println(cnt);
    }
}
