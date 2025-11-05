import java.util.*;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed String: " + reversed);


        // StringBuilder reversed = new StringBuilder();

        // for (int i = str.length() - 1; i >= 0; i--) {
        //     reversed.append(str.charAt(i));
        // }

        // System.out.println(reversed.toString());

        char [] carr=str.toCharArray();
        int left = 0, right = carr.length - 1;

        while (left < right) {
            char temp = carr[left];
            carr[left] = carr[right];
            carr[right] = temp;
            left++;
            right--;
        }

    }
}
