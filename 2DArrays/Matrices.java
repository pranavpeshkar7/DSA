import java.util.*;
public class Matrices{

    public static boolean search(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Key Found at index "+"("+i+","+j+")");
                    return true;
                }
            }
        }
        return false;
    }

    public static void minNo(int matrix[][]){
        int minimum = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                minimum = Math.min(minimum,matrix[i][j]);
            }
        }
        System.out.println("Smallest no: "+minimum);
    }

    public static void maxNo(int matrix[][]){
        int maximum = Integer.MIN_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                maximum = Math.max(maximum,matrix[i][j]);
            }
        }
        System.out.println("Largest no: "+maximum);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int n = matrix.length; 
        int m = matrix[0].length;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix, 5);
        minNo(matrix);
        maxNo(matrix);
        sc.close();
    }
}