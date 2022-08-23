import java.util.*;
  
  public class Main{
  
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getDifference(b, n1, n2);
        System.out.println(d);
    }

    public static int getDifference(int b, int n1, int n2){
        // write your code here
        int result=0;
        int carry =0;
        int tens =1;
        while(n2>0){
            int dig1=n1%10;
            int dig2=n2%10;
            n1 /=10;
            n2 /=10;
            int dig=0;
            dig2 +=carry;
            if(dig2>=dig1){
                carry=0;
                dig =dig2-dig1;
            }else {
                carry=-1;
                dig=dig2+b-dig1;
            }
            
            result +=dig*tens;
            tens *=10;
            
        }


        return result;
    }

}