import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class minisum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr1=new int[n];
        for(int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int [] arr2=new int[n];
         for(int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0;i<n/2;i++)
        {
            int temp=arr2[i];
            arr2[i]=arr2[n-i-1];
            arr2[n-i-1]=temp;
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr1[i]*arr2[i];
        }
        System.out.println(sum);
        
    }
}           
