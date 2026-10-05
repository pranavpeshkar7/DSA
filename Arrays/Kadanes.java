public class Kadanes {
    
    public static void kadanes(int numbers[]){
        int current = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            current += numbers[i];
            if(current<0){
                current=0;
            }
            maxSum = Math.max(current, maxSum);
        }
        System.out.println("Max Sum: " + maxSum);
    }

    public static void kadanesAlgo(int numbers[]){
        int current = 0;
        int maxSum = Integer.MIN_VALUE;
        int negative = 0;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] < 0){
                negative += numbers[i];
            }
            current += numbers[i];
            if(current<0){
                current=0;
            }
            maxSum = Math.max(current, maxSum);
            if(current == 0){
                current = negative;
            }
        }
        System.out.println("Max Sum: " + maxSum);
    }

    public static void main(String args[]){
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        int nums[] = {-1};
        kadanes(nums);
    }
}
