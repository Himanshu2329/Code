public class SumOfDigits {
    public static void main(String[] args) {
        int num = 1342;
        System.out.println(SumOfDigits(num));
        System.out.println(prod(num));
    }

    private static int SumOfDigits(int n) {
        // TODO Auto-generated method stub
        if (n<1) {
            return 0;
        }
        return (n%10)+ SumOfDigits(n/10);
        // throw new UnsupportedOperationException("Unimplemented method 'SumOfDigits'");
    }
    private static int prod(int n) {
        // TODO Auto-generated method stub
        if (n%10==n) {
            return n;
        }
        return (n%10)* prod(n/10);
        // throw new UnsupportedOperationException("Unimplemented method 'SumOfDigits'");
    }
}
