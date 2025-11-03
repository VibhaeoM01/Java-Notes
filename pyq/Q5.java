public class Q5 {
    public static Boolean Vow(char c) {
        c=Character.toLowerCase(c);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            return true;
        return false;
    }

    public static void main(String[] args) {
        String[] s={"doll","gjh"};
        int val=0;
        int maxi=Integer.MIN_VALUE;
        for(int j=0;j<s.length;j++)
        {
            String c=s[j];
            val=0;
            for(int i=0;i<c.length();i++)
            {
                if(!Vow(c.charAt(i))) val++; 
            }
            maxi=Math.max(maxi,val);
        }
        if(maxi==0) {
            System.out.println(0);
            return;
        }
        int ans=1;
        for(int i=1;i<=maxi;i++)
        {
            ans*=i;
        }
        System.out.println(ans);
    }
}
