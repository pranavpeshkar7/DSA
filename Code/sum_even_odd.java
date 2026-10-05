import java.util.*;

public class sum_even_odd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sumEven = 0;
        int sumOdd = 0;
        int n = sc.nextInt();
        for(int i=1;i<=n;i=i+2){
            sumOdd = sumOdd + i;
        }
        for(int j=0;j<=n;j=j+2){
            sumEven = sumEven + j;
        }
        System.out.println("Sum of odd no.'s : "+sumOdd);
        System.out.println("Sum of even no.'s : "+sumEven);
        sc.close();
    }
}
