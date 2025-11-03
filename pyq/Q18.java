public class Q18 {
    public static void main(String[] args) {
        String s="a123c";
        int cnt=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetter(s.charAt(i)))
            {
                int j=i;
                i++;
                while(Character.isDigit(s.charAt(i)))
                {
                    i++;
                }
                if((j-i)>1)
                    cnt++;
            }
        }
        System.out.println(cnt);
    }
}
