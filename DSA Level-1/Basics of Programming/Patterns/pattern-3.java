import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space =n-1;
        int star=1;
        

        // write ur code here
    for(int i=1;i<=n;i++){
        for(int j=1;j<=space;j++){
            System.out.print("\t");
        }
         for(int j=1;j<=star;j++){
            System.out.print("*\t");
        }
        star++;
        space--;
        System.out.println();
    }

    }
}
