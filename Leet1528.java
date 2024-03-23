// import java.util.ArrayList;
import java.util.Arrays;

/**
 * Leet1528
 */
public class Leet1528 {

    public static void main(String[] args) {
        String s = "codeleet";
        int index[] = { 4, 5, 6, 7, 0, 2, 1, 3 };
        // ArrayList <String> List=new ArrayList<>();
       char res[] = new char[index.length];
        for (int i = 0; i < index.length; i++) {
            res[index[i]]=s.charAt(i);

        }
        String str= new String(res);
        System.out.println(str);

    }
}