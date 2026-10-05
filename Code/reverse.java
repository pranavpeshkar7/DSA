public class reverse {
    public static void main(String args[]){
        int lastdigit = 0;
        int n = 22335;
        while(n>0){
            lastdigit = n % 10;
            n = n / 10;
            System.out.print(lastdigit);
        }
    }
}
