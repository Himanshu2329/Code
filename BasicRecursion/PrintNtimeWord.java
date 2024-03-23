// package BasicRecursion;

import java.util.*;

public class PrintNtimeWord {
    public static void main(String[] args) { 
        int n=3;
        // List<Integer> List = 
         GetElement(n);
        // System.out.println(List);
    }

    private static void GetElement(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        if(n<1){
            return ;
        }
        list.add(n);
        GetElement(n-1);
        // return list;
        System.out.println(list);
        // TODO Auto-generated method stub

        // throw new UnsupportedOperationException("Unimplemented method 'GetElement'");
    }
    
}
