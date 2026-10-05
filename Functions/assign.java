// import java.util.*;
public class assign {
    public static float mean(float a, float b, float c){
        float mean = (a+b+c) / 3;
        return mean;
    }

    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        } else {
            return false;
        } 
    }

    public static void sum(int n){
        int sum = 0;
        while(n>0){
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n / 10;
        }
        System.out.print(sum);
    }

   

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number:");
        // int n = sc.nextInt();
        // System.out.println(isEven(n));
        // sc.close();
        // System.out.println(Math.min(2,4));
        // System.out.println(Math.max(2,7));
        // System.out.println(Math.sqrt(9));
        // System.out.println(Math.pow(4,2));
        // System.out.println(Math.abs(-10000));
        // sum(23454);
    }
}
