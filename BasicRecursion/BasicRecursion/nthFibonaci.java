package BasicRecursion;

public class nthFibonaci {
    public static void main(String[] args) {
        int num=7;
        int res =getFib(num);
        System.out.println(res);
    }

    private static int getFib(int num) {
        // TODO Auto-generated method stub
        if(num <2){
            return num;
        }
          return  getFib(num-1)+getFib(num-2);
        // throw new UnsupportedOperationException("Unimplemented method 'getFib'");
    }
    
}
