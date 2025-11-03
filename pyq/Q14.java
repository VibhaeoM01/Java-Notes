import java.util.HashMap;
import java.util.Map;

public class Q14{
    public static void main(String[] args) {
        int n=3;
        int mini=Integer.MAX_VALUE;
        Map<Integer,Integer>mp=new HashMap<>();
        int [][] arr= {{-1,2,3},{2,3,4},{3,4,5}};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                mp.put(arr[i][j], mp.getOrDefault(arr[i][j],0)+1);
            }
        }
        for(int key:mp.keySet())
        {
            if(key>0 && mp.get(key)==1) mini=Math.min(key, mini);
        }
        if(mini==Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(mini);
    }
}