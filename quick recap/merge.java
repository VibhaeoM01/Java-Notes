import java.util.*;
public class merge {
    public static void merge(int []arr,int l,int m,int r) {
        int n1=m-l+1;
        int n2=r-m;
        int[] a1=new int[n1];
        int[] a2=new int[n2]; 
        for(int i=0;i<n1;i++)
        {
            a1[i]=arr[l+i];
        }
        for(int i=0;i<n2;i++)
        {
            a2[i]=arr[m+1+i];
        } 
        int i=0,j=0;
        int k=l;
        while(i<n1 && j<n2)
        {
            if(a1[i]<a2[j])
            {
                arr[k++]=a1[i++];
            }
            else{
                arr[k++]=a2[j++];
            }
        }
        while(i<n1)
        {
            arr[k++]=a1[i++];
        }
        while(j<n2)
        {
            arr[k++]=a2[j++];
        }
    }
    public static void mergesort(int[] arr,int l,int r) {
        if(l<r){
        int mid=l +(r-l)/2;
        mergesort(arr,l,mid);
        mergesort(arr,mid+1,r);
        merge(arr,l,mid,r);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt();
        // int [] arr={};
        sc.close();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int l=0,r=n-1;
        mergesort(arr,l,r);
    }
}
