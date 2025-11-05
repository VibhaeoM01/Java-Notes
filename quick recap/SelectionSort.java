// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

public class SelectionSort {
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
     
        int n=sc.nextInt();
        // int [] arr={};
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        ///Logic
        // It finds min number in whole iteration, after iterating, it swaps with i,
        for(int i=0;i<n-1;i++)
        {
            int minInd=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[minInd]>arr[j])
                {
                    minInd=j;
                }
            }
            
            // swap();
            int temp=arr[i];
            arr[i]=arr[minInd];
            arr[minInd]=temp;
        }


        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        
        
    }
}