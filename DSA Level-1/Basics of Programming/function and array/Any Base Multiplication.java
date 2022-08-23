import java.util.*;

public class Main{
 
   public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
        scn.close();
    }



    public static int singleDigitProduct(int b ,int n1,int dig2){
        int rv=0;
        int carry =0;
        int tens=1;
        while(n1>0 ||carry>0){
            int dig1=n1%10;
            n1 /=10;
            int product=dig1*dig2+carry;
            carry =product/b;
            product=product%b;
            rv +=product*tens;
            tens *=10;
        }

        return rv;
    }

    public static int getSum(int b, int n1, int n2){
        // write ur code here
        int rv=0;
        int carry =0;
        int tens=1;
        while( n1>0 || n2>0 || carry>0 ){
            int dig1=n1%10;
            int dig2=n2%10;
            int sum=dig1+dig2+carry;
            carry=sum/b;
            sum=sum%b;
            rv +=sum*tens;
            tens *=10;
            n1 /=10;
            n2 /=10;


        }
        return rv;
    }

    public static int getProduct(int b, int n1, int n2){
        // write your code here
        int rv=0;
        int tens=1;
        while(n2>0){
            int dig2=n2%10;
            n2 /=10;
            int product1=singleDigitProduct(b,n1,dig2);
            rv=getSum(b,rv,product1*tens);
            tens *=10;

        }
        return rv;
    }

}