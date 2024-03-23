public class Leet169 {
    public static void main(String[] args) {
        int arr[]={3,2,3};
        int n=arr.length;
        int result=MajorityElement(arr,n);
        System.out.println(result);
    }
    static int MajorityElement(int[] arr,int n){
        for (int i = 0; i < arr.length; i++) {
            int cnt=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    cnt++;
                }
            }
            if (cnt>(n/2)) {
                return arr[i];
            }
        }
        return -1;
    }
}
