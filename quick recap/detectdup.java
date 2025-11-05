import java.util.*;

public class detectdup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for(Integer i:hm.keySet())
        {
            if(hm.get(i)>=2)
            {
                System.out.println(i);
            }
        } 
        // HashSet<Integer>hs=new HashSet<>();
        // for(int i=0;i<n;i++)
        // {
        //     if(hs.contains(arr[i]))
        //     {  
        //         System.out.println(arr[i]);
        //     }
        //     hs.add(arr[i]);
        // } 
    }
}
