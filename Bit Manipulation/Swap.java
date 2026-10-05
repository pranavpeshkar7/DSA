public class Swap {
    public static void swapNo(int a, int b){
        System.out.println("Before: "+a+" "+b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b; 
        System.out.println("After: "+a+" "+b);
    }
    public static void main(String[] args) {
        swapNo(2, 4);
    }
}
