public class FindSmallestNumber {
    public static void main(String[] args) {
        int arr[]= {1,23,54,-1,12,-123,1234};
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i])
                min=arr[i];
        }

        System.out.println(min);
    }
}
