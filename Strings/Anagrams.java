import java.util.*;
public class Anagrams {
    public static boolean findAnagram(String str1, String str2){
        boolean flag = false;
        int count = 0;
        int total = 0;
        for(int i=0; i<str1.length(); i++){
            for(int j=0; j<str2.length(); j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    count++;
                }
            }
        }
        total = Math.max(str1.length(), str2.length());
        if(count == total){
            flag = true;
        }
        // System.out.println(count);
        return flag;
    }

    public static void findAnagramOptimized(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length() == str2.length()){
            char str1arr[] = str1.toCharArray();
            char str2arr[] = str2.toCharArray();
            Arrays.sort(str1arr);
            Arrays.sort(str2arr);
            boolean result = Arrays.equals(str1arr, str2arr);
            if(result){
                System.out.println("Anagrams");
            } else{
                System.out.println("Not Anagrams");
            }
        } else{
            System.out.println("Not Anagrams");
        }
    }

    public static void main(String args[]){
        String str1 = "care";
        String str2 = "race";
        // System.out.println(findAnagram(str1, str2));
        findAnagramOptimized(str1, str2);
    }
}
