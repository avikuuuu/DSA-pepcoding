import java.util.Arrays;

class Main
{
    // Utility function to reverse elements of an array
    public static void reverse(int[] A)
    {
        int[] B=new int[A.length];
        for(int i=0;i<A.length;i++){
            B[A.length-1-i]=A[i];
        }
        for(int i=0;i<A.length;i++){
           A[i]=B[i];
        }
        
    }

    public static void main(String[] args)
    {
        int[] A = { 1, 2, 3, 4, 5 };
        reverse(A);
        System.out.println(Arrays.toString(A));
    }
}
