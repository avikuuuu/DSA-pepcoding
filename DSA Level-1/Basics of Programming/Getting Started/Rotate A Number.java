import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
    // write your code here  
       Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k=scn.nextInt();
//
        int count =0;
        int temp =n;
        while(temp > 0){
            temp /= 10;
            count++;
        }
        k=k%count;
        if(k<0){
            k=k+count;
        }
        int div = 1;
        int mult =1;

        for(int i = 1;i<=count;i++){
            if(i<=k){
                div = div*10;
            }else{
                mult = mult*10;
            }
        }
        int mlt = n/div;
        int first = n%div;
        int finalProduct= first*mult+mlt;
        System.out.println(finalProduct);


//




    }
}
