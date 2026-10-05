public class HollowRhombus {
    public static void rhombus(int n){
        for(int i=1; i<=n; i++){
            for(int spaces=1; spaces<=(n-i); spaces++){
                System.out.print("  ");
            }
            for(int stars=1; stars<=n; stars++){
                if(i==1 || i==n|| stars==1 || stars==n){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        rhombus(5);
    }
}
