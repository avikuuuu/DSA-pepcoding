import java.util.*;

public class Main {

    public static void main(String[] args) {
       

        // write ur code here
        Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    for (int i = 1; i <= n; i++)
    {
      for (int j = 1; j <= i; j++) //MAGIC LOOP
      {
        System.out.print("*	");
      }
      System.out.println();
    }
  }
}
