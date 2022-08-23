import java.util.*;
  
  public class Main{

 
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();
        int aBTAB=AnyBaseToAnyBase(n,sourceBase,destBase);
        System.out.println(aBTAB);
    }

        public static int AnyBaseToAnyBase(int n,int sourceBase,int destBase){
        // write code here
        int rv=0;
        int div=1;
        int rv1=0;
        int div1=1;
        while(n>0){
            int temp=n%10;
            n=n/10;
            rv +=temp*div;
            div *=sourceBase;
        }
        while(rv>0){
            int dTB=rv%destBase;
            rv=rv/destBase;
            rv1 +=dTB*div1;
            div1 *=10;
            
        }

        return rv1;
    }
}