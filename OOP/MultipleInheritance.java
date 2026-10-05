public class MultipleInheritance {
    public static void main(String[] args) {
        // King k = new King();
        // k.move();
        Beer b = new Beer();
        b.eatGrass();
        b.eatMeat();
    }
}

interface ChessPlayer{
    void move();
}

class King implements ChessPlayer{
    public void move(){
        System.out.println("Up, Down, Right, Left (by one step)");
    }
}

class Queen implements ChessPlayer{
    public void move(){
        System.out.println("Up, Down, Right, Left, Diagonal");
    }
}

class Rook implements ChessPlayer{
    public void move(){
        System.out.println("Up, Down, Right, Left");
    }
}

interface Herbivorous{
    void eatGrass();
}

interface Carnivorous{
    void eatMeat();
}

class Beer implements Herbivorous, Carnivorous{
    public void eatGrass(){
        System.out.println("Eats grass");
    }

    public void eatMeat(){
        System.out.println("Eats Meat.");
    }
}