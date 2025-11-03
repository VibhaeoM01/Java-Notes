public class Q6 {
    public static Boolean Vow(char c) {
        c = Character.toLowerCase(c);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            return true;
        return false;
    }

    public static void main(String[] args) {
        String s = "ABC";
        int val = 0;  
        s.toLowerCase();
        val = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!Vow(s.charAt(i)))
                val++;
        } 

        if (val == 0) {
            System.out.println(0);
            return;
        }
        int ans = 1;
        for (int i = 1; i <= val; i++) {
            ans *= i;
        }
        System.out.println(ans);
    }
}
