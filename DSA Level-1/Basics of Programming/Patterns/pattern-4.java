import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space=0;
        int str = n;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }
           for(int j=1;j<=str;j++){
                System.out.print("*\t");
            }
            space++;
            str--;
            System.out.println();
        }

    }
}
