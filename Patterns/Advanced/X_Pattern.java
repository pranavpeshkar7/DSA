public class X_Pattern {
    public static void X(int n){
        for(int i=n; i>=1; i--){
            for(int spaces=1; spaces<=(n-i); spaces++){
                System.out.print("  ");
            }
            for(int stars=1; stars<=((2*i)-1); stars++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=2; i<=n; i++){
            for(int spaces=1; spaces<=(n-i); spaces++){
                System.out.print("  ");
            }
            for(int stars=1; stars<=((2*i)-1); stars++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        X(5);
    }
}
