import java.util.Arrays;

public class libbook {
    public static Boolean check(int i){
        if(i==1) return false;
        for(int j=2;j<i;j++)
        {   
            if(i%j==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int [] arr= {3,7,5,6};
        Arrays.sort(arr);
        int cnt=0;
        int k=5;
        for(int i=1;i<=arr.length;i++)
        { 
            if(check(i))
            {
                if(arr[i]>k) cnt+=k;
                else cnt+=arr[i];      
            }
        }
        System.out.println(cnt);
    }
}
