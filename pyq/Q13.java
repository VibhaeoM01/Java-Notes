public class Q13 {
    public static void main(String[] args) {
        String s="aartfu";
        char [] carr= new char[26];
        for(int i=0;i<s.length();i++)
        {
            int val=s.charAt(i)-'a';
            carr[val]++;
        }
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<carr.length;i++)
        {
            if(carr[i]%2!=0)
            {
                maxi=Math.max(maxi,carr[i]);
            }
            else{
                mini=Math.min(mini,carr[i]);
            }
        }
        System.out.println(Math.abs(maxi-mini));
        // System.out.println(maxi);
        // System.out.println(mini);
    }
}
