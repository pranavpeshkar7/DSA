public class MaxSumSubArrays {
    public static void maxSum(int numbers[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length-1; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currentSum = 0;
                for(int k=start; k<=end; k++){
                    currentSum += numbers[k];
                }
            }
            if(maxSum<currentSum){
                maxSum = currentSum;
            }
        }
        System.out.println("Maximum sum among all subarrays is "+maxSum);
    }

    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        maxSum(numbers);
    }
}
