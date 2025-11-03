public class Q17 {
    public static void main(String[] args) {
        int [] arr= {1,3,2,1,5,4};
        int d=2;
        int sum=0;
        for(int i=1;i<arr.length-1;i++)
        {
            if((i-d)>=0 && (i+d)<arr.length)
            {
                if(arr[i-d]<arr[i] && arr[i]<arr[i+d]){
                     sum+=arr[i]; 
                }
            }
            if((i-d)<0) {
                if(arr[i+d]<arr[i]) {
                    sum+=arr[i]; 
                }
            }
            else if((i+d)>0){
                if(arr[i-d]<arr[i]){
                    sum+=arr[i]; 
                }
            }  
        }
        System.out.println(sum);
    }
}
