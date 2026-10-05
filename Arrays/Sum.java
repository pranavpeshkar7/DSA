public class Sum {
    public static void printSubArrays(int numbers[]){
        int tp = 0;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Subarrays: "+tp);
    }
    public static void calculateSubArrays(int numbers[]){
        int a = 0;
        int tp = 0;
        int totalSum[] = new int[15];
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                int sum = 0;
                for(int k=start; k<=end; k++){
                    sum = sum + numbers[k];
                }
                totalSum[a] = sum;
                a++;
                System.out.print(sum +" ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Subarrays: "+tp);
        for(int i=0; i<=totalSum.length-1; i++){
            System.out.print(totalSum[i]+" ");    
        }
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<=totalSum.length-1; i++){
            if(largest<totalSum[i]){
                largest = totalSum[i];
            }
            if(smallest>totalSum[i]){
                smallest = totalSum[i];
            }
        }
        System.out.println();
        System.out.println("Largest No: "+largest);
        System.out.println("Smallest No: "+smallest);
    }

    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10};
        printSubArrays(numbers);
        calculateSubArrays(numbers);
    }
}