// import java.util.Arrays;
import java.util.Scanner;

/**
 * Leet1365
 */
public class Leet1365 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int res[]=getSmallNumber(arr,n);
        System.out.println(res);
    }

    private static int[] getSmallNumber(int[] arr, int n) {
        // TODO Auto-generated method stub
        int []res=new int[n];
        for (int i = 0; i < arr.length; i++) {
            int cnt=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    cnt++;
                }
                res[i]=cnt;
            }
        }

        return res;
        // throw new UnsupportedOperationException("Unimplemented method 'getSmallNumber'");
    }
}