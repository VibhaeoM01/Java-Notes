import java.util.*;

public class removeduplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        ArrayList<Integer>arr1=new ArrayList<>();
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            if(!hs.contains(arr[i]))
            {
                 hs.add(arr[i]);
                arr1.add(arr[i]);
            }
           
        }
        System.out.println(hs);
    }   
}


// 