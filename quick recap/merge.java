// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    
    public static void merge(int []arr,int l,int mid,int r)
    {
        int n1=mid-l+1;  //
        int n2=r-mid;
        int []a1=new int[n1];
        int []a2=new int[n2];
        for(int i=0;i<n1;i++)
        {
            a1[i]=arr[l+i];
        }
        for(int i=0;i<n2;i++)
        {
            a2[i]=arr[mid+1+i]; //
        }
        int k=l;
        int i=0,j=0;
        while(i<n1 && j<n2)
        {
            if(a1[i]<a2[j])
            {
                arr[k++]=a1[i++];
            }
            else
            {
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
    public static void mergeSort(int []arr, int l, int r)
    {
        if(l<r)
        {
            int mid=l+(r-l)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
    public static void main(String[] args) {
        int [] arr={5,3,2,5,1,6};
        int n=arr.length;
        mergeSort(arr,0,n-1);
        for(int num:arr) 
        {
            System.out.println(num);
        }
    }
}