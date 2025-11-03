public class BS {
    public static void main(String[] args) {
        int [] A={4,5,6,7,8,10};
        int k=8;
        int i=0,j=A.length-1;
        while(i<=j)
        {
            int mid= i+(j-i)/2;
            if(A[mid]==k){
                System.out.println(mid);
                System.exit(0);
            }
            else if(A[mid]<k)
            {
                i=mid+1;
            }
            else j=mid-1;
        }
        System.out.println(-1);
    }
}
