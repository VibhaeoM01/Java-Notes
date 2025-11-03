import java.util.HashMap;
import java.util.HashSet;

public class Q1 {
    public static void main(String[] args) {
        String s="abcaba";
        // int [] arr=new int[26];
        // for(int i=0;i<s.length();i++)
        // {   
        //     int ind=s.charAt(i)-'a'+1;
        //     if(arr[ind]==0) arr[ind]=i+1;
        // }
        // HashMap<Character,Integer> mp= new HashMap<>();
        // for(int i=0;i<s.length();i++)
        // {
        //     if(!mp.containsKey(s.charAt(i))){mp.put(s.charAt(i),i+1);}
        // }
        // StringBuilder sb= new StringBuilder();
        // for(int i=0;i<s.length();i++)
        // {
        //     char ch=s.charAt(i);  // Change int to char
        //     int n=mp.get(ch);     // Now using Character as key
        //     while(n>0)
        //     {
        //         sb.append(s.charAt(i));
        //         n--;
        //     }
        //     if(i<s.length()-1){sb.append('-');}
        // }
        // System.out.println(sb.toString());
        int [] freq= new int [26]; 
        for(int i=0;i<s.length();i++)
        {
            int val=s.charAt(i)-'a';
            if(freq[val]==0)
            {
                freq[val]=i+1;
            }
        }
        
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            int val=s.charAt(i)-'a';
            int n=freq[val];
            while(n>0)
            {
                sb.append(s.charAt(i));
                n--;
            }
            sb.append('-');
        }
        String ans=sb.toString();
        System.out.println(ans.substring(0, ans.length()-1));

    }
}
