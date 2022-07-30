import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
    Scanner scn=  new Scanner (System.in);
        int n = scn.nextInt();
        
        int inv = 0;
        int op = 1;
        while(n !=0){
            int ov = n%10;
            int ip = ov;
            int iv = op;
            
            inv = inv + iv *(int)Math.pow(10,ip-1);
            n= n/10;
            op++;
            
        }
        System.out.println(inv);
}
    
}
