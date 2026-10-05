public class trial {
    public static void main(String args[]){
        int n = 7;
        for(int i=1;i<=n;i++){

            for(int a=1;a<=i;a++){
                System.out.print(" ");
            }

            for(int j=1;j<=n;j--){
                System.out.print("* ");
            }

            for(int b=1;b<=i;b++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
