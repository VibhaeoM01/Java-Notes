public class Q11 {
    public static void main(String[] args) {
        int v=12;
        int [] arr={1,2,3,4,5,6};
        int n=v+arr.length;
        int [] arr1= new int[v];
        for(int i=0;i<arr.length;i++)
        {
            arr1[i]=arr[i];
        }
        for(int i=arr.length;i<v;i++)
        {
            arr1[i]=arr1[i-1]+arr1[i-2];
        }
        for(int i=0;i<v;i++)
        {
            System.out.println(arr1[i]);
        }
    }
}
