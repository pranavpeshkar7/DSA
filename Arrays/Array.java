import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        for(int i=0; i<marks.length; i++){
            marks[i] = sc.nextInt();
        }
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println();
        // marks[1] = marks[1] + 1;
        // System.out.println(marks[1]);
        // marks[2] = 100;
        // System.out.println(marks[2]);
        // int percentage = (marks[0]+marks[1]+marks[2]) / 3;
        // System.out.println("Average: "+percentage+"%");
        System.out.println(marks.length);
        sc.close();
    }
}
