import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bufferedReader.readLine());
        int[] arr=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]=Integer.parseInt(bufferedReader.readLine());
        }
        int max=0;
        for (int j=0;j<arr.length;j++){
            if (max<arr[j]){
                max=arr[j];
            }
        }
        for(int floor=max;floor>=1;floor--){
            for (int i=0;i< arr.length;i++){
                if(arr[i]>=floor){
                    System.out.print("*	");
                }else {
                    System.out.print("	");
                }
            }
            System.out.println();
        }



    }

}