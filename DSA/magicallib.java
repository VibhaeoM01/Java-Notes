import java.util.Scanner;

public class magicallib {
    public static void main(String[] args) {
        int [][] arr=new int[3][3];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        sc.close();
        int cnt=0;
        int sum=0;
        for(int i=0;i<3;i++)
        {
            sum=0;
            for(int j=0;j<3;j++)
            {
                if(arr[i][j]%2!=0) sum+=arr[i][j];
            }
            if(sum%2==0) cnt++;
        }
        System.out.println(cnt);
    }
}
