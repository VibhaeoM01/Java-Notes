import java.util.*;
    class primeNo {
        public static Boolean isPrime(int n)
        {
            if(n<=1) return false;
            if(n==2) return true;
            if(n%2==0) return false;
            for(int i=3;i<=Math.sqrt(n);i+=2)
            {
                if(n%i==0) return false;
            }
            return true;
        }
        public static void main(String[] args) {
             int n=20;
             for(int i=1;i<=20;i++)
             {
                 if(isPrime(i))
                 {
                     System.out.println(i);
                 }
             }
        }
    }