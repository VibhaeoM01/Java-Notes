public class maxlencvowel {
    public static Boolean check(String word)
    {
        if(word.charAt(0)=='a' ||word.charAt(0)=='e' || word.charAt(0)=='i'|| word.charAt(0)=='o' || word.charAt(0)=='u')
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s="I am enjoying online education";
        int maxi=0;
        String[] words=s.split("\\s+");
        String result="00";
        for(String word:words)
        {
            if(check(word) && word.length()%2==0)
            {
                if(word.length()>maxi)
                {
                    maxi=word.length();
                    result=word;
                }
            }
        }
        System.out.println(result);
    }
}
