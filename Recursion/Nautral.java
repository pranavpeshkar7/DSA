public class Nautral {
    public static int findNatural(int n){
        if(n == 1){
            return 1;
        }
        int num = n + findNatural(n-1);
        return num;
    }
    public static void main(String[] args) {
        System.out.println(findNatural(5));
    }
}
