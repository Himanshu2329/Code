public class CountZero {
    public static void main(String[] args) {
        System.out.println(count(10101010,0));
    }

    private static int count(int i,int c) {
        // TODO Auto-generated method stub
        if(i==0){
            return c;
        }
        if(i%10==0){    
            return count(i/10, c+1);
        }
        return count(i/10, c);
        // throw new UnsupportedOperationException("Unimplemented method 'count'");
    }
}
