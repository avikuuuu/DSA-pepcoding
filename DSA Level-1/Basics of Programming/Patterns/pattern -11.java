




import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
    int space=2*n-3;
    int str=1;
    
    for(int i = 1;i <= n;i++){
        int val=1;
        for(int j =1;j <=str;j++){
        System.out.print(val+"	");
        val++;
    }
      for(int j = 1;j <= space;j++){
        System.out.print("	");
    }
    if(n==i){
        str--;
        val--;
    }
      for(int j = 1;j <= str;j++){
          val--;
        System.out.print(val+"	");
    }

  str++;
  space -=2;
  System.out.println();
  
    }

 }
}