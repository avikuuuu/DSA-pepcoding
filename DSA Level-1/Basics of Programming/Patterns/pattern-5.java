import java.util.*;

public class Main {
  public static void main(String[] args)
  {
     Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int str =1;
        int space=n/2;

        for (int i=1;i<=n;i++){
           for(int j=1;j<=space;j++){
               System.out.print("\t");
           }
            for(int j=1;j<=str;j++){
                System.out.print("*\t");
            }
            if(i <= n/2){
                space--;
                str += 2;
            }else {
                space++;
                str -= 2;
            }

            System.out.println();
        }

    }
}
