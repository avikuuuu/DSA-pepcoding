
import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

       String s= scn.next();
        System.out.println(s);
        System.out.println(s.length());
//        System.out.println(s.charAt(7));
//        System.out.println(s.substring(0,7));
//        System.out.println(s.substring(4));
//
//        for(int i=0;i<s.length();i++){
//            for (int j=i+1;j<=s.length();j++){
//                System.out.println(s.substring(i,j));
//            }
//        }
        String[] sab=s.split(" ");
        for (int i=0;i<sab.length;i++){
            System.out.println(sab[i]);
        }



        }

    }


