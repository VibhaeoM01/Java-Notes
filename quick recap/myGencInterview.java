public class myGencInterview {
    public static int compute(int arrEle)
    {  
        arrEle=arrEle%100;
        arrEle=arrEle/10; 
        return arrEle;
    }
    public static void main(String[] args) {
        int [] arr= {12, 25, 33, 40};
        int FinalVal=0;
        for(int i=0;i<arr.length;i++)
        {
            int oncePlaceEle=compute(arr[i]);
            FinalVal=FinalVal*10+oncePlaceEle;
        }
        System.out.println(FinalVal);
        if(FinalVal%10==0) System.out.println("yes");
        System.out.println("No");
    }
}
