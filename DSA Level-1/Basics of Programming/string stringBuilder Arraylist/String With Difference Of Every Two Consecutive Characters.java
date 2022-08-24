import java.io.*;
import java.util.*;

public class Main {

    public static StringBuilder solution(String str){
        // write your code here

        StringBuilder sc=new StringBuilder();
        sc.append(str.charAt(0));
        for(int i=1;i<str.length();i++){
                int ve=str.charAt(i)-str.charAt(i-1);
                sc.append(ve);
            sc.append(str.charAt(i));
        }

        return sc;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(solution(str));
    }

}