import java.util.*;

public class Main {

    public static boolean isPalandrom(String s){

        int strt=0;
        int last=s.length()-1;

        while (last>=strt){
            char char1=s.charAt(strt);
            char char2=s.charAt(last);
            if(char2 !=char1){
             return false;
            }else {
            last--;
            strt++;}

        }

        return true;
    }



    public static void solution(String str){
        //write your code here
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String ss=str.substring(i,j);
                if(isPalandrom(ss)==true){
                    System.out.println(ss);
                }
            }
        }


    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

}
