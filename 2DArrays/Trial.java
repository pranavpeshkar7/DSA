public class Trial {

    public static int print7(int matrix[][], int key) {
        int count = 0;
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int sumRow(int nums[][], int row) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[row][i];
        }
        return sum;
    }

    public static void main(String args[]){
        int matrix[][] = {{4,7,8},{8,8,7}};
        System.out.println(print7(matrix, 7));
        System.out.println();
        int nums[][] = {{1,4,9},{11,4,3},{2,2,3}};
        System.out.println(sumRow(nums, 1));
    }
}
