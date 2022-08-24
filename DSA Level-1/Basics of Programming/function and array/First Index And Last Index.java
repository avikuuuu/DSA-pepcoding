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
       int firstIndex=-1;
       while (low<=high){
           int Mid=(low+high)/2;
           if(d > arr[Mid]){
               low=Mid+1;

           } else if (d<arr[Mid]) {
               high=Mid-1;

           }else {
               firstIndex=Mid;
              high=Mid-1;
           }
       }
        System.out.println(firstIndex);

        low=0;
        high= arr.length-1;
        int lastIndex=-1;
        while (low<=high){
            int Mid=(low+high)/2;
            if(d > arr[Mid]){
                low=Mid+1;
            } else if (d<arr[Mid]) {
                high=Mid-1;

            }else {
                lastIndex=Mid;
                low=Mid+1;
            }
        }
        System.out.println(lastIndex);

    }


}