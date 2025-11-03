// import java.util.*;

public class rev_string {
    public static void main(String[] args) {

        String str="Vibhaeo";
        //REVERSE FN
        String s= new StringBuilder(str).reverse().toString();
        
        // STRINGBUILDER APPEND
        StringBuilder rev= new StringBuilder();
        for(int i=str.length()-1;i>=0;i--)
        {
            rev.append(str.charAt(i));
        }
        rev.toString();


        // another one
        char [] charArray=str.toCharArray();
        int l=0,r=charArray.length-1;
        while(l<r)
        {
            char temp=charArray[l];
            charArray[l]=charArray[r];
            charArray[r]=temp;
            l++;
            r--;
        }
        System.out.println(charArray);
        System.out.println(rev);
        System.out.println(s);
    }
}