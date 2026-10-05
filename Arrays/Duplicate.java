public class Duplicate {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 1};

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // Check if current element appeared before
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // Print only if not duplicate
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
