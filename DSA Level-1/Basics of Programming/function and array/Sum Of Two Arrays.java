import java.io.*;
import java.util.*;

public class Main{
public static void main(String[] args) throws Exception {
        // write your code here
       Scanner scn= new Scanner(System.in);
        //for first array
        int n1=scn.nextInt();
        int[] arr=new int[n1];
        for(int i=0;i<n1;i++){
            arr[i]=scn.nextInt();
        }
        //for second array
        int n2=scn.nextInt();
        int[] arr2=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=scn.nextInt();
        }

        int length= arr.length > arr2.length ? arr.length : arr2.length;;

        int[] sum= new int[length];
//        int carry=0;
//        int tens=0;
//        for (int i=length-1;i>=0;i--){
//                sum[i]= arr[i]+arr2[i]+carry;
//                carry = sum[i]/10;
//                int remainder=sum[i]%10;
//                sum[i] +=remainder*tens;
//                tens *=10;
//        }
//        System.out.println(Arrays.toString(sum));

        int i=arr.length-1;
        int j=arr2.length-1;
        int k= sum.length-1;

        int carry=0;
        while (k>=0){
            int d=carry;
            if(i>=0){
                d +=arr[i];
            }
            if(j>=0){
                d +=arr2[j];
            }
            carry=d/10;
            d=d%10;
            sum[k]=d;

            k--;
            i--;
            j--;

        }
        if(carry !=0){
            System.out.println(carry);
        }
        for(int val:sum){
            System.out.println(val);
        }

    }

}