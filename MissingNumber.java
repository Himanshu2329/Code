import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums={9,6,4,2,3,5,7,0,1};
        int result=findMissingNumber(nums);
        System.out.println("The missing number is "+result);
    }
    static int  findMissingNumber(int[] nums){
        // int n=nums.length;
        // Arrays.sort(nums);
        // for (int i = 0; i < nums.length; i++) {
        //     if(i!=nums[i]){
        //         return i;
        //     }
        // }
        // return -1;
        // find the total sum of the elements of that array by int total=n*(n+1)/2
        int n=nums.length;
        int total=n*(n+1)/2;
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        return total-sum;

    }
}
