public class Occurence {
    public static int firstOccurence(int arr[], int key, int i){
        if(arr[i] == key){
            return i;
        }
        if(arr[i] == arr.length){
            return -1;
        }
        return firstOccurence(arr, key, i=i+1);
    }

    public static int lastOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int key = 5;
        int arr[] = {1,3,2,6,5,7,8,3,4};
        System.out.println(lastOccurence(arr, key, 0));
    }
}
