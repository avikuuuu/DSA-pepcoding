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
        int max=arr[0];
        int min=arr[0];
       for(int j=0;j<arr.length;j++){
           if(max<arr[j]){
               max=arr[j];
           }
           if (min>arr[j]){
               min=arr[j];
           }
       }
       
        System.out.println(max-min);    
        
    }

}