import java.io.*;
import java.util.*;

public class Checklexico {

    public static void main(String[] args) {
        // If first has greater lexicographical order than second print yes 
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        sc.close();
        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) > 0 ? "yes" : "no");
        

        
        
                                            //IMPPPPPPPP
        //Ternary returns values, not void, so we can't explicitly  print in ternary each side like this
        //  A.compareTo(B) > 0 ? System.out.println("Yes") : System.out.println("No");





        // StringBuilder str=new StringBuilder();
        // str.append(Character.toUpperCase(A.charAt(0)));
        // for(int i=1;i<B.length();i++)
        // {
        // str.append(A.charAt(i));
        // }
        // str.append(" ");                                             

        // str.append(Character.toUpperCase(B.charAt(0)));
        // for(int i=1;i<B.length();i++)
        // {
        // str.append(B.charAt(i));
        // }
        // str.toString();
        // System.out.println(str);


        // Best way to use substring method
        String capA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capA + " " + capB);

    }
}
