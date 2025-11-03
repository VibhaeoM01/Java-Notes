import java.util.Arrays;

public class Rotate {
    public static void reverse(int [] arr,int l,int r)
    {
        while(l<r)
        {
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        int k=2;
        
        // while(k>0)
        // {
        //     int temp=arr[arr.length-1];
        //     // arr[0]=temp;
        //     for(int i=0;i<arr.length;i++)
        //     {
        //         int temp1=arr[i];
        //         arr[i]=temp;
        //         temp=temp1;
        //     }
        //     k--;
        // }
        // for(int i=0;i<arr.length;i++) System.out.println(arr[i]);

        
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1); 
        System.out.println(Arrays.toString(arr)); 
    }
}
