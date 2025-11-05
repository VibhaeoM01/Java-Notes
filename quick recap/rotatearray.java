import java.util.ArrayList;
import java.util.Scanner;

public class rotatearray {

    public static void reverse(int []arr,int l,int r) {
        // int n=arr.length;
        //use while loop only to reverse the array, please
        while(l<r)
        {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     
        int n=sc.nextInt();
        // int [] arr={};
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int m=n;
        int k=2;
        ArrayList<Integer>arr1=new ArrayList<>();
        int cnt=0;
        int i=n-k;
        while(cnt!=m)
        { 
            arr1.add(arr[i]);
            cnt++;
            i=(i+1)%n;
        }
        System.out.println(arr1); 
        k=k%n;
        reverse(arr,0,k);
        reverse(arr, k+1, n-1);
        reverse(arr, 0, n-1);
    }
}
