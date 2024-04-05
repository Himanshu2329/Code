public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345;
        System.out.println(reverse(num));
    }
    static int reverse(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)*10+reverse(n/10);
    }
}
