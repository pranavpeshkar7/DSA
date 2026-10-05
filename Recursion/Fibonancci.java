public class Fibonancci {
    public static int findFibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fibo = findFibonacci(n-1) + findFibonacci(n-2);
        return fibo;
    }
    public static void main(String[] args) {
        System.out.println(findFibonacci(5));
    }
}
