public class UpperToLowerCase {
    public static void main(String args[]){
        for(int ch='A'; ch<='Z'; ch++){
            System.out.println((char)(ch | ' '));
        }
    }
}
