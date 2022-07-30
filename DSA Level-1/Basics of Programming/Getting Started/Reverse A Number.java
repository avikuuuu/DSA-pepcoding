import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here 
      Scanner scn=  new Scanner (System.in);
        int n = scn.nextInt();
        
        // int count=0;
        int temp=n;
        while(temp !=0){
            int dig = temp %10;
            temp =temp/10;
            System.out.println(dig);
        }
       
        
    }
   }
