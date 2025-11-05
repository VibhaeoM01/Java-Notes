public class quick{
    public static void swap(int []arr, int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void quick(int [] arr, int l,int h)
    {
        if(l<h)
        {
            int pivot=arr[l];
            int i=l;
            int j=h;
            while(arr[i]<=pivot && i<=h-1)
            {
                i++;
            }
            while(arr[j]>pivot && j>=l+1){
                j--;
            }
            if(i<j) swap(arr,arr[i],arr[j]);
        swap(arr, arr[l],arr[j]);
        int pi=j;
        quick(arr,l,pi-1);
        quick(arr,pi+1,h);
        }
    }
    
    public static void main(String[] args) {
        int[]arr={3,5,3,2,6};
        quick(arr, 0, arr.length-1);       
    }
}