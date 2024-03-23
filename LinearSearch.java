/**
 * LinearSearch
 */
public class LinearSearch {

    public static void main(String[] args) {
        int arr[] = {12,41,532,13,325,134,123,245,2,413,312,3,124,2};
        int x=0;
        System.out.println(find(arr,x));
    }

    private static int find(int[] arr, int x) {
        // TODO Auto-generated method stub
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                return 1;
            }
        }
        return -1;
        // throw new UnsupportedOperationException("Unimplemented method 'find'");
    }
}