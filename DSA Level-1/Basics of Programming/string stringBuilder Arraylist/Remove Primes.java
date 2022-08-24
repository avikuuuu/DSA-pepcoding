import java.io.*;
import java.util.*;

public class Main {


    public static boolean isPrime(int ap){
        for(int div=2;div*div<=ap;div++){
            if(ap%div==0){
                return false;
            }
        }
        return true;
    }

    public static void solution(ArrayList<Integer> al) {
        // write your code here
        for (int i = al.size() - 1; i >= 0; i--) {
            int ap = al.get(i);
            if (isPrime(al.get(i))) {
                al.remove(i);
            }
        }



        }
        public static void main (String[]args){
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            ArrayList<Integer> al = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                al.add(scn.nextInt());
            }
            solution(al);
            System.out.println(al);
        }

    }