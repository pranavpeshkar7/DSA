public class Substring {
    public static String subString(String str, int si, int ei){
        String substring = "";
        for(int i=si; i<ei; i++){
            substring += str.charAt(i);
        }
        return substring;
    }
    public static void main(String args[]){
        String str = "Hello World";
        System.out.println(subString(str, 0, 5));
    }
}
