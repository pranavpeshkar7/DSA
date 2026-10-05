public class MethodOverRiding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("Eats something");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("Eats Grass");
    }
}
