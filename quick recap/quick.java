// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void swap(int []arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        
        // arr[i]=arr[i]+arr[j];
        // arr[j]=arr[i]-arr[j];
        // arr[i]=arr[i]-arr[j]
    }
    public static void quick(int []arr,int l,int h)
    {
        if(l<h)
        {
            int pivot=arr[l];
            int i=l;
            int j=h;
            while(i<j)
            {
                while(i<=h-1 && arr[i]<pivot) i++;
                while(j>=l+1 && arr[j]>pivot) j--;
                if(i<j) swap(arr,i,j);
            }
            swap(arr,l,j);
            quick(arr,l,j-1);
            quick(arr,j+1,h);
        }
    }
     
    public static void main(String[] args) {
        int [] arr={5,3,2,5,1,6};
        int n=arr.length;
        quick(arr,0,n-1);
        for(int num:arr) 
        {
            System.out.println(num);
        }
    }
}