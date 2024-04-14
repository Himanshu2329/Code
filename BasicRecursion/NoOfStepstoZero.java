public class NoOfStepstoZero {
    public static void main(String[] args) {
        int n = 14;
        System.out.println(noOfSteps(n));
    }

    static int noOfSteps(int n) {
        // TODO Auto-generated method stub
        return help(n,0);
        // throw new UnsupportedOperationException("Unimplemented method 'noOfSteps'");
    }

    static int help(int number, int steps){
        if(number==0){
            return steps;
        }
        if(number%2==0){
            return help(number/2,steps+1);
        }
        return help(number-1,steps+1);
    }

}
