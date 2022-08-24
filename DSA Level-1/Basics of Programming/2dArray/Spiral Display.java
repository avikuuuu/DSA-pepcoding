import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        int row= scn.nextInt();
        int col= scn.nextInt();

        int[][] arr=new int[row][col];


        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                arr[i][j]= scn.nextInt();
            }
        }

        int minr=0;
        int minc=0;
        int maxr=arr.length-1;
        int maxc=arr[0].length-1;
        int tt=row*col;
        int count=0;


        while(count<tt){
            //left
            for (int i=minr, j=minc;i<=maxr && count<tt;i++){
                System.out.println(arr[i][j]);
                count++;
            }
            minc++;
            //bottom
            for(int i=maxr,j=minc;j<=maxc&& count<tt;j++){
                System.out.println(arr[i][j]);
                count++;
            }
            maxr--;
            //right
            for (int i=maxr,j=maxc;i>=minr&& count<tt;i--){
                System.out.println(arr[i][j]);
                count++;
            }
            maxc--;
            //top
            for (int i=minr,j=maxc;j>=minc&& count<tt;j--){
                System.out.println(arr[i][j]);
                count++;
            }
            minr++;
        }
    }

    }