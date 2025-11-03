import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String A=sc.nextLine();
        // programming
        Set<Character> st= new LinkedHashSet<>();
        for(char i:A.toCharArray())
        {
            st.add(i);
        }

        for(char i:st)
        {
            System.out.println(i);
        }
    }
}


// Learnings
// LinkedHashset, LinkedHashMap is used to keep the order of first appearance    THIS TYPE OF MAP/SET IS ONLY IN JAVA
// HashSet, HashMap to fastest and only used when we don't care about order of insertion
// TreeSet, TreeMap is used to store in sorted order