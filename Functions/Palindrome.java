public class Palindrome {
    public static int palindrome(int n){
        int reverse = 0;
        while(n>0){
            int num = n % 10;
            reverse = reverse*10 + num;
            n = n / 10;
        }
        return reverse;
    }

    public static boolean checkPalindrome(int n){
        if(n==palindrome(n)){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome(1213));
    }
}
