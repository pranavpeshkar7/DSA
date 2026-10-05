public class AbstractClass {
    public static void main(String args[]){
        // Animal a = new Animal();
        // Horse h = new Horse();
        // h.eat();
        // h.walk();

        // Chicken ch = new Chicken();
        // ch.eat();
        // ch.walk();

        Mustang myHorse = new Mustang();
    }
}

abstract class Animal{
    Animal(){
        System.out.println("Animal Constructor called.");
    }
    void eat(){
        System.out.println("Animal eats.");
    }

    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse Constructor called.");
    }
    void walk(){
        System.out.println("Horse walks.");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Constructor called.");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("Chicken walks.");
    }
}