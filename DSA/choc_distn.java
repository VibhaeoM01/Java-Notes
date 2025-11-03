public class choc_distn {
    public static void main(String[] args) {
        long sum=0;
        final int MOD = (int)1e9 + 7;  

        double n=1e6;
        for(int i=1;i<=n;i++)
        {
            if(i%5==0) {
                sum=(sum+4)%MOD;
            } 
            sum=(sum+i)%MOD;
        }
        System.out.println(sum);
    }
}
