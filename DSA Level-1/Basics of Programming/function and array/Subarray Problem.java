import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bufferedReader.readLine());
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(bufferedReader.readLine());
         }
           for(int i=0;i<arr.length;i++)
           {
            for(int j=i+1;j<=arr.length;j++)
            {
                for(int q=i;q<j;q++)
                {
                    System.out.print(arr[q]+"	");
                }
                System.out.println();
            }

           }
    }

}