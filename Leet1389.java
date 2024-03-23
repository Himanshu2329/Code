import java.util.ArrayList;
import java.util.Scanner;

public class Leet1389 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int index[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < index.length; i++) {
            index[i]=sc.nextInt();
        }
        int res[]=CreateTragerArr(arr,index);
        System.out.println(res);
  }

static int[] CreateTragerArr(int[] arr,int index[]) {
    // TODO Auto-generated method stub
    ArrayList<Integer> List= new ArrayList<>();
    for(int i=0;i<arr.length;i++){
        List.add(index[i],arr[i]);
    }
        
    int res[]=new int[arr.length];
    for(int i=0;i<List.size();i++){
            res[i]=List.get(i);
        }
    return res;

    // throw new UnsupportedOperationException("Unimplemented method 'CreateTragerArr'");
}  
}
