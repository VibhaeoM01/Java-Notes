public class Q20{
    public static void main(String[] args) {
        String s="cba";
        // char [] carr=
        int sum=0;
        for(int i=0;i<s.length()-1;i++)
        {
            sum+=Math.abs((s.charAt(i)-'a')-(s.charAt(i+1)-'a'));
        }
        System.out.println(sum);
    }
}