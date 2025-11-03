import java.util.Scanner;

public class PenSwitching {
    public static void main(String[] args) {
        // int [] arr = new int[n];
         Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Boolean check=false;
        if(arr[0]%2!=0) check=false;
        else check=true;
        int cnt=0;
        for(int i=1;i<n;i++)
        { 
            if(check==false && arr[i]%2==0)
            {
                cnt++;
                check=true;
            }
            else if(arr[i]%2!=0)  check=false;
        }
        System.out.println(cnt);
    }
}
