import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean result=isPalindrome(n);
        System.out.println(result);
    }
    static boolean  isPalindrome(int x){
        String s=String.valueOf(x);
        int i=0;
        int j=s.length()-1;
        while (i<=j) {
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
