import java.util.*;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        
         String s="Vibhaeo";
            StringBuilder sb= new StringBuilder(s).reverse();
            System.out.println(sb.toString());
            char[] carr=s.toCharArray();
            int i=0,j=carr.length-1;
            while(i<j)
            {
                char temp=carr[i];
                carr[i]=carr[j];
                carr[j]=temp;
                i++;
                j--;
            }

    }
}
