public class Q2 {
    public static void main(String[] args) {
        int [] arr= {10,10,3,7,6};
        int sum=0;
        for(int i=1;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        int sum1=arr[0];
        int cnt=0; // to count the number of such non empty partitions whose sum's
        // absolute diff is even
        for(int i=1;i<arr.length;i++)
        {   
            if(Math.abs(sum1-sum)%2==0){
                cnt++;
            }
            sum1+=arr[i];
            sum-=arr[i];
        }
        System.out.println(cnt);

    }
}
