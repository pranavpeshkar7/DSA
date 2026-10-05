public class OptimizedBS {
    public static void bubbleSort(int arr[]){
        int swaps = 0;
        for(int i=0; i<arr.length-1-swaps; i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                swaps++;
            }
        }
        System.out.println("Total Swaps: "+swaps);
    }

    public static void show(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        bubbleSort(arr);
        show(arr);
    }
}
