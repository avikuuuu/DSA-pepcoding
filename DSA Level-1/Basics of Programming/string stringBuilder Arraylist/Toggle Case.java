import java.io.*;
import java.util.*;

public class Main {

    public static StringBuilder toggleCase(String str){
        //write your code here
        StringBuilder sc =new StringBuilder(str);
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                char l= (char) ('a'+str.charAt(i)-'A');
                sc.setCharAt(i,l);
            }else{
                char U= (char) ('A'+str.charAt(i)-'a');
                sc.setCharAt(i,U);
            }
        }







//        String sc=str.charAt(0)+"";
//        for(int i=1;i<str.length();i++){
//            if(Character.isUpperCase(str.charAt(i))){
//                sc +='a'+str.charAt(i)-'A';
//
//            }else{
//                sc +='A'+str.charAt(i)-'a';
//            }
//        }

        return sc;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
    }

}