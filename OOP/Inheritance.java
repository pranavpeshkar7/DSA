public class Inheritance {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}

//Base Class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

//Derived Class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims in water");
    }
}

class Shark extends Fish{
    int sharpTeeths;
}

class Tuna extends Fish{
    int speed;
}

class Mamal extends Animal{
    int legs;
    void walk(){
        System.out.println("walks");
    }
}

class Bird extends Animal{
    int wings;
    void fly(){
        System.out.println("fly");
    }
}

class Peacock extends Bird{
    int feather;
}

class Dog extends Mamal{
    String breed;
}

class Cat extends Mamal{
    String color;
}

class Human extends Mamal{
    String gender;
}