public class Butterfly {
    // public static void butterfly(int n){
    //     //upper part
    //     for(int i=1; i<=n; i++){
    //         for(int stars=1; stars<=i; stars++){
    //             System.out.print("* ");
    //         }
    //         for(int spaces=1; spaces<=((n*2)-(i*2)); spaces++){
    //             System.out.print("  ");
    //         }
    //         for(int stars=1; stars<=i; stars++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    //     //lower part
    //     for(int i=1; i<=n; i++){
    //         for(int stars=1; stars<=n-i+1; stars++){
    //             System.out.print("* ");
    //         }
    //         for(int spaces=1; spaces<=((i*2)-2); spaces++){
    //             System.out.print("  ");
    //         }
    //         for(int stars=1; stars<=n-i+1; stars++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    public static void butterfly(int n){
        //upper part
        for(int i=1; i<=n; i++){
            for(int stars=1; stars<=i; stars++){
                System.out.print("* ");
            }
            for(int spaces=1; spaces<=2*(n-i); spaces++){
                System.out.print("  ");
            }
            for(int stars=1; stars<=i; stars++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //lower part
        for(int i=n; i>=1; i--){
            for(int stars=1; stars<=i; stars++){
                System.out.print("* ");
            }
            for(int spaces=1; spaces<=2*(n-i); spaces++){
                System.out.print("  ");
            }
            for(int stars=1; stars<=i; stars++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        butterfly(4);
    }
}
