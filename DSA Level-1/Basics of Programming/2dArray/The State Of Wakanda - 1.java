import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) {



        Scanner scn=new Scanner(System.in);

        int r1=scn.nextInt();
        int c1=scn.nextInt();

        int[][] arr=new int[r1][c1];

        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr[i][j]= scn.nextInt();
            }
        }

        for(int j=0;j<c1;j++){
            if(j%2==0){
            for(int i=0;i<r1;i++){
                System.out.println(arr[i][j]);
            }
            }else {
                for (int i=r1-1;i>=0;i--){
         System.out.println(arr[i][j]);
                }
            }
        }
    }

    }