public class Q12 {
    public static void main(String[] args) {
        int n=5;
        int [] arr={10,15,12,9,14}; 
        int [] arr1= new int[5];
        for(int i=0;i<arr.length;i++)
        {
            if(i==0)
            {
                if(arr[arr.length-1]>arr[i]) arr1[i]++;
                if(arr[i]<arr[i+1]) arr1[i]++;
            }
            else if(i==arr.length-1) 
            {
                if(arr[i]<arr[i-1]) arr1[i]++;
                if(arr[i]<arr[0]) arr1[i]++;
            }
            else
            {
                if(arr[i]<arr[i+1]) arr1[i]++;
                if(arr[i]<arr[i-1]) arr1[i]++;
            }
        }
        //  for (int i = 0; i < N; i++) { 
        //     int count = 0; 
        //     if (A[(i - 1 + N) % N] > A[i]) count++; 
        //     if (A[(i + 1) % N] > A[i]) count++; 
        //     System.out.print(count); 
        //     if (i < N - 1) System.out.print(" "); 
        // }
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }
    }
}
