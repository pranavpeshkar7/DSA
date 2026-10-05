public class SolidRhombus {
    public static void rhombus(int n){
        for(int i=1; i<=n; i++){
            for(int spaces=1; spaces<=(n-i); spaces++){
                System.out.print("  ");
            }
            for(int stars=1; stars<=n; stars++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        rhombus(10);
    }
}
