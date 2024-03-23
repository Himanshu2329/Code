import java.util.ArrayList;
import java.util.List;

public class PrintDivisor {
    public static void main(String[] args) {
        int n=10;
        List<Integer> res=PrintDivisor(n);
        System.out.println("The divisors of "+n+" are:" + res);
    }

    private static List<Integer> PrintDivisor(int n) {
        // TODO Auto-generated method stub
        List<Integer> List=new ArrayList<>();
        for (int i =1;i<=n;i++){
            if(n%i==0){
                List.add(i);
            }
        }
        return List;
        // throw new UnsupportedOperationException("Unimplemented method 'PrintDivisor'");
    }
}
