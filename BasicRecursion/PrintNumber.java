/**
 * PrintNumber
 */
public class PrintNumber {

    public static void main(String[] args) {
        int n=5;
        getNum(n);
    }
    static void getNum(int n){
        if(n==0){
            return;
        }
        // 1 to N
        getNum(n-1);
        System.out.print(n);



        // N to 1
        // System.out.print(n);
        // getNum(n-1);
    }
}