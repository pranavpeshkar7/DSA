public class Transpose {

    public static void transposeMatrix(int matrix[][]) {
        int row = 3;
        int col = 3;
        int transpose[][] = new int[col][row];

        System.out.println("Matrix:");
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transpose Matrix:");
        for(int i=0; i<transpose.length; i++) {
            for(int j=0; j<transpose[0].length; j++) {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int matrix[][] = {{11,12,13}, 
                          {21,22,23}, 
                          {31,32,33}};
        transposeMatrix(matrix);
    }
}
