public class Armstrong {
    public static void main(String[] args) {
        int n = 1634; 
        boolean res=getArm(n);
        System.out.println(res);

    }
 
    private static boolean getArm(int n) {    
        // TODO Auto-generated method stub 
        int digit=0;
        int result=0;
        int temp=n;
        while (temp!=0) {
            temp/=10;
            digit++;
        }
        int temp1=n;
        while (temp1!=0) {
            int res=temp1%10;
           result+=Math.pow(res, digit);
            temp1/=10;
        }
        return result==n;
        // return result;
        // throw new UnsupportedOperationException("Unimplemented method 'getArm'");
    }
}
