public class password {
    public static void main(String[] args) {
        String s="abc10a";
        int maxi=-1;
        char [] carr= s.toCharArray();
        for(int i=0;i<carr.length;i++)
        {   
            for(int j=carr.length-1;j>=0;j--){
                if(carr[i]!=carr[j]){
                    // System.out.println(carr[i]+" "+carr[j]);
                    maxi=Math.abs(j-i);
                    System.out.println(maxi);
                    System.exit(0);
                }
            }
        }
    }
}
