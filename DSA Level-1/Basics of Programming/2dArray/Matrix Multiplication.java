import java.io.*;
import java.util.*;

public class Main {

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scn=new Scanner(System.in);

        int r1=scn.nextInt();
        int c1=scn.nextInt();

        int[][] arr=new int[r1][c1];

        for(int i=0;i<r1;i++){
           for(int j=0;j<c1;j++){
               arr[i][j]= scn.nextInt();
           }
        }
        int r2=scn.nextInt();
        int c2=scn.nextInt();

        int[][] arr2=new int[r2][c2];

        for(int i=0;i< r2;i++){
            for(int j=0;j<c2;j++){
                arr2[i][j]= scn.nextInt();
            }
        }

        if(c1 !=r2){
            System.out.println("Invalid input");
            return;
        }
        int[][] product=new int[r1][c2];
        
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for (int k=0;k<r2;k++){
                    product[i][j] +=arr[i][k]*arr2[k][j];
                }
            }
        }
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(product[i][j]+" ");
            }
            System.out.println();
        }

    }
}