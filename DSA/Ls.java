public class Ls {
    public static void main(String[] args) {
        int [] A={1,5,4,2,9};
        int k=4;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==k) {
                System.out.println(A[i]);
                // System.exit(0);
            } 
        }
        System.out.println(-1);
    }
}
