public class Searchin2dArray {
    public static void main(String[] args) {
        int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
        int find=9;
        // int res[]=getRowscols(matrix,find);
        // System.out.println(res);
        int res=getMax(matrix);
        System.out.println(res);
    }

    private static int getMax(int[][] matrix) {
        // TODO Auto-generated method stub
        int max=matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(max<matrix[i][j]){
                    max=matrix[i][j];
                }                
            }
        }
        return max;
        // throw new UnsupportedOperationException("Unimplemented method 'getMax'");
    }

    static int[] getRowscols(int[][] matrix, int find) {
        // TODO Auto-generated method stub
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]==find){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
        // throw new UnsupportedOperationException("Unimplemented method 'getRowscols'");
    }
}
