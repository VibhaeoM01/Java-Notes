// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

public class BS {
    public static void main(String[] args) { 
        int[] arr= new int[5];
        // int [] arr={};
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);
        int l=0;
        int k=3;
        Boolean check=false;
        int r=arr.length-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(k==arr[mid]) {
                System.out.println("found!");
                check=true;
                break;
            }
            else if(k<arr[mid])
            {
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        if(!check)
        {
            System.out.println("Not found");
        }       
    }
}