public class crypto {
    public static void main(String[] args) {
        String ip="abc";
        StringBuilder sb= new StringBuilder();
        for(char c:ip.toCharArray())
        {
            if(c=='a') sb.append('z');
            else {
                sb.append((char)(c-1));  // same in cpp -> (char)(c-1)
            } 
        } 
        sb.toString();
        System.out.println(sb);
    }
}
