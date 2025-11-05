// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

public class LS {
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int [] arr={};
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        Boolean check=false;
        int k=3;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==k) 
            {
                System.out.println("Found!");
                check=true;
                break;
            }
        }
        if(!check) 
        {
             System.out.println("Not Found!");
        }       
    }
}