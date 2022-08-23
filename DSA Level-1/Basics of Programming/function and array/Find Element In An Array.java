import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
        int n1= Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[n1];
        for(int i=0;i<n1;i++){

            int takedigit=Integer.parseInt(bufferedReader.readLine());
            arr[i]=takedigit;

        }
        int d= Integer.parseInt(bufferedReader.readLine());
        int count=-1;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==d){
                count=i;
            }
        }
        System.out.println(count);

    }

}
