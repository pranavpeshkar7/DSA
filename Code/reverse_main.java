public class reverse_main {
    public static void main(String args[]){
        int lastDigit = 0;
        int reverse = 0;
        int n = 34256;
        while(n>0){
            lastDigit = n % 10;
            reverse = (reverse * 10) + lastDigit;
            n = n / 10;
        }
        System.out.println(reverse);
    }
}
