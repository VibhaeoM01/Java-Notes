// // Online Java Compiler
// // Use this editor to write, compile and run your Java code online
// import java.util.*;

// public class Bubblesort {
//     public static void main(String[] args) { 
//         Scanner sc=new Scanner(System.in);
     
//         int n=sc.nextInt();
//         // int [] arr={};
//         int[] arr= new int[n];
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<n-1;i++)
//         {
//             for(int j=0;j<n-i-1;j++)
//             {
//                 if(arr[j]>arr[j+1])
//                 {
//                      int temp=arr[j];
//                      arr[j]=arr[j+1];
//                      arr[j+1]=temp;
                    
//                     //swap
//                     // a=a^b;
//                     // b=a^b;
//                     // a=a^b;
                    
//                     // a=a+b;
//                     // b=a-b;
//                     // a=a-b;
//                 }
//             }
//         }
//         for(int i=0;i<n;i++)
//         {
//             System.out.println(arr[i]);
//         }
        
        
//     }
// }






import java.util.*;
 public class Bubblesort {
      
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            Boolean isSwapped=false;
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped=true;
                }
            }
            if(!isSwapped) break;
        }
            for(int num:arr) 
            {
                System.out.println(num);
            }

        
    }
}