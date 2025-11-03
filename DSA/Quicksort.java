import java.util.ArrayList;
import java.util.Arrays;

//Basically a 2 pointer technqiue, which is initially are index 1 and last(0th index is taken as pivot) shrink by comparing with pivot; space is O(1) ignoring recursion stack space and TC is O(n logn)


public class Quicksort {

    public static void swap(ArrayList<Integer>A,int a,int b) {
        int temp=A.get(a);
        A.set(a,A.get(b));
        A.set(b,temp);
    }
    public static void qsort(ArrayList<Integer> A, int l, int r) {
       if(l<r)
       {
         int p = A.get(l);
        int i=l;
        int j=r;

        while(i<j)
        {   
            
            while(i<=r && A.get(i) <= p) i++;
            while(j>=l && A.get(j) > p) j--;
            if(i<j)
            { 
                swap(A, i, j); 
            } 
        }
       
        swap(A, j, l);
        qsort(A,l,j-1);
        qsort(A,j+1,r);
       }
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(4, 6, 2, 5, 7, 9, 1, 3));

        qsort(A, 0, A.size()-1);
        System.out.println(A);
    }
}
