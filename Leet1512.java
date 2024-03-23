import java.util.Scanner;

public class Leet1512 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(Goodpair(arr));
    }

    private static int Goodpair(int[] arr) {
        // TODO Auto-generated method stub
        int[] ans=new int[101];

        int res=0;
        for (int i : arr) {
            res+=ans[i]++;
            
        }
        return res;
        // throw new UnsupportedOperationException("Unimplemented method 'Goodpair'");
    }
}
