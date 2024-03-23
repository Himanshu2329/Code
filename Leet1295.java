public class Leet1295 {
    public static void main(String[] args) {
        int arr[] = { 437, 315, 322, 431, 686, 264, 442 };
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];

            int cnt = 0;
            while (ele != 0) {
                ele /= 10;
                cnt++;

            }
            if (cnt % 2 == 0) {
                res++;
            }
        }
        System.out.println(res);
    }
}
