import java.util.Scanner;

//1 is niether prime nor consonant
// 2 is prime
// multiple of 2 is not
public class test {

    static Boolean isprime(int val) {
        if(val<=1) return false;
        if(val==2) return true;
        if(val%2==0) return false;
        for(int i=3;i<=Math.sqrt(val);i++)
        {
            if(val%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int k = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // sc.close();
        int n=2;
        int k=4;
        int [] arr={10,2};
        int cnt=0;
        for(int i=1;i<=n;i++)
        {
            if(isprime(i+1)==true)
            {
                // System.out.println("hey");
                if(arr[i]>k)
                {
                    cnt+=k;
                }
                else{
                    cnt+=arr[i];
                }
            }
        }
        System.out.println(cnt);

    }
}
