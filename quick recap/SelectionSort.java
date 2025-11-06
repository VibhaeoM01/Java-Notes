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
            int minIndex=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[minIndex]>arr[j])
                {
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        for(int num:arr) 
        {
            System.out.println(num);
        }
        
        
    }
}