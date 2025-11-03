public class Q3 {
    public static void main(String[] args) {
        int i=0;
        int cnt=0;
        int [] arr={1,2,1,3,5,2,4,2}; 
        int n=arr.length;
        while(i<n-2)
        {
            if(arr[i]+arr[i+2]==arr[i+1]) cnt++;
            i++;
        }
        System.out.println(cnt);
    }
}
