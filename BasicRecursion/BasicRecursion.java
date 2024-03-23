<<<<<<< HEAD
               package BasicRecursion;
=======
// package BasicRecursion;
>>>>>>> 7b94128 (Done)

public class BasicRecursion {
    public static void main(String[] args) { 
        // int n=1;
        int y=50;
        // getElements(n,y);   
        getElementsY(y);
        // System.out.println(res);                             
    }
    private static void getElementsY(int y) {
        // TODO Auto-generated method stub
        if(y<1){          
            return;
        }
        System.out.println(y);
        getElementsY(y-1);
        // throw new UnsupportedOperationException("Unimplemented method 'getElementsY'");
    }
    static void getElements(int n, int y){
        if(n>y){
            return;
        }
        System.out.println(n);
      getElements(n+1,y);
        
    } 
}
