public class ReverseNumber {
    public static void main(String[] args) {
        int n = 15678;
        int res= getReverse(n);
        System.out.println("The reverse of "+n+" is: " +res);
    }
    
    // Function to return the reversed number   
    static int getReverse(int n){
        
        int res=0;
        while (n > 0) {
            int temp = n % 10;
            if(res>Integer.MAX_VALUE/10 || res<Integer.MIN_VALUE/10) return 0;
            res=res*10+temp;
            n/=10;

        }
        // System.out.println(res);
        return res;
    }
}
