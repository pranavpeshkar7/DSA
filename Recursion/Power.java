public class Power {
    public static int findPower(int x,int n){
        if(n == 0){
            return 1;
        }
        return x * findPower(x, n-1);
    }

    public static int optimizedPower(int x,int n){
        if(n == 0){
            return 1;
        }
        int halfPower = optimizedPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;
        System.out.println(halfPowerSq);
        if(n % 2 != 0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
    
    public static void main(String[] args) {
        System.out.println(optimizedPower(2, 10));
        // System.out.println(1/2);
    }
}
