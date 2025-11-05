public class Q4 {
    public static void main(String[] args) {
        String s1="ABD";
        String s2="AABCCAD";
        int [] carr1= new int[26];
        int [] carr2= new int[26];
        for(int i=0;i<s1.length();i++)
        {
            int val=s1.charAt(i)-'A';
            carr1[val]++;
        }
        for(int i=0;i<s2.length();i++)
        {
            int val=s2.charAt(i)-'A';
            carr2[val]++;
        }
        int cost=0;
        int n=Math.max(carr1.length, carr2.length);
        for(int i=0;i<n;i++)
        {
            if(carr1[i]<carr2[i])
            {
                cost+=carr2[i]-carr1[i];
            }
        }
        System.out.println(cost);
    }
}

 