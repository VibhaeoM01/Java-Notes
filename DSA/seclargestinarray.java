public class seclargestinarray {
    public static void main(String[] args) {
        int [] arr={5,34,2,56,10,45};
        int l=Integer.MIN_VALUE;
        int sl=-Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(l<arr[i])
            {
                sl=l;
                l=arr[i];
            }
            else if(sl<arr[i] && l>arr[i])
            {
                sl=arr[i];
            }
        }
        System.out.println(sl);

    }
}
