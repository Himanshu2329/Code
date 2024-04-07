public class Palindrome {
    public static void main(String[] args) {
        System.out.println(Palindrome(123321));
    }
    // Function to reverse the number using recursion
    static int rev(int n){
        if(n%10==n){
            return n;
        }
        return (n/10)*10 + rev(n%10);
    }
    static boolean Palindrome(int n){
        return n==rev(n);
    }
}
