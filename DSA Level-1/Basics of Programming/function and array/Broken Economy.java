import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception {
       Scanner scn =new Scanner(System.in);
       int  td=scn.nextInt();
       int[] arr=new int[td];
       for(int i=0;i< arr.length;i++){
           arr[i]=scn.nextInt();
       }
       int d = scn.nextInt();

      Arrays.sort(arr);

       int low=0;
       int high= arr.length-1;
       int cell =0;
       int floor=0;
       while (low<=high){
           int Mid=(low+high)/2;
           if(d > arr[Mid]){
               low=Mid+1;
               cell=arr[Mid];
           } else if (d<arr[Mid]) {
               high=Mid-1;
               floor=arr[Mid];
           }else {
               cell=arr[Mid];
               floor=arr[Mid];
               return;
           }

       }
       
        System.out.println(floor);
         System.out.println(cell);
    }


}