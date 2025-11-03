import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class ntest {
    public static void main(String[] args) {
        int N=10;
        int a=2;
        int b=5;
        ArrayList<Integer> arr= new ArrayList<>();
        TreeSet<Integer> st= new TreeSet<>();
        int m=N;
        while(m>0)
        {
            arr.add(m);
            m=m-a;
            
        }
        m=N;
        while(m>0)
        {
            arr.add(m);
            m=m-b;
            
        }
        for(int k:arr)
        {
            m=k;
            while(m>0)
            {
                 st.add(m);
                m=m-a;
               
            }
        }
        for(int k:arr)
        {
            m=k;
            while(m>0)
            {
                st.add(m);
                m=m-b;
                
            }
        }
        for(int i=0;i<arr.size();i++)
        {
            // System.out.println(arr.get(i));
            st.add(arr.get(i));
        }
        for(int k:st)
        {
            System.out.println(k);
        }
    }
}
