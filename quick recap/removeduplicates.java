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
        // ArrayList<Integer>arr1=new ArrayList<>();
        // HashSet<Integer>hs=new HashSet<>();
        LinkedHashSet<Integer>lhs= new LinkedHashSet<>();
        for(int i=0;i<n;i++)
        { 
            lhs.add(arr[i]);
        }
        System.out.println(lhs);
    }   
}


// 