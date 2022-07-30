import java.util.*;

public class Main {

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int str =n/2+1;
        int space=1;

        for (int i=1;i<=n;i++){
            for(int j=1;j<=str;j++){
                System.out.print("*\t");
            }
            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=str;j++){
                System.out.print("*\t");
            }
            if(i <= n/2){
                space +=2;
                str--;
            }else {
                space -=2;
                str++;
            }


            System.out.println();
        }

    }
}
