import java.util.Scanner;

/**
 * Leet1920
 */
public class Leet1920 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        getArrPermutaion(arr);
        // System.out.println(res);

    }

    public static void getArrPermutaion(int[] arr) {
        // TODO Auto-generated method stub
        int res[]=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i]=arr[arr[i]];
            System.out.print(res[i]);
        }
        
        // throw new UnsupportedOperationException("Unimplemented method 'getArrPermutaion'");
    }
}