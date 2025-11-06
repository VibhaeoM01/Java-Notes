public class Palindromearray {
    public static void main(String[] args) {
        // int []arr= {1,2,3,4,3,2,1};
        String s="Nayan";
        s=s.toLowerCase();
        Boolean check=false;
        int i=0,j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j)){
                check=true; 
                break;
            }
            i++;
            j--;
        }
        if(check) System.out.println("No");
        else System.out.println("Yes");
    }
}
