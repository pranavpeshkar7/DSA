public class P {
    public static boolean isPalindrome(String s) {
        String str_l = s.toLowerCase();
        String str = str_l.replaceAll("[, :]","");
        int n = str.length();
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        // String s = "Hello World!";
        // String str = s.replaceAll("[ !]", "");
        // System.out.println(str);
        // // String str1 = "Hello#World!".replaceAll("[#!]", "");
        // // System.out.println(str1);
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        // String s = "A man, a plan, a canal: Panama";
        // String str = s.toLowerCase();
        // System.out.println(str);
    }
}
