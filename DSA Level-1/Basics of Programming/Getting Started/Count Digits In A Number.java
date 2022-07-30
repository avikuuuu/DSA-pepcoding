import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here 
    
    Scanner scn=  new Scanner (System.in);
    int N = scn.nextInt();
    
    for(int i=1;i<=N;i++){
        N=N/10;
        System.out.println(i);
        
    }
    
   }
  }
