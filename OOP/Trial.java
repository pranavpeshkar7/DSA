public class Trial {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 99;
        Student s2 = new Student(s1);
        s1.marks[2] = 100;
        for(int i=0; i<3; i++){
            System.out.println(s1.marks[i]);
        }
    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];

    // //Shallow copy
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = name;
    //     this.roll = roll;
    //     this.marks = marks;
    // }

    //Deep copy
    Student(Student s1){
        marks = new int[3];
        this.name = name;
        this.roll = roll;
        // this.marks = marks;
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }
    Student(){
        marks = new int[3];
        System.out.println("Constructor is called.");
    }
}