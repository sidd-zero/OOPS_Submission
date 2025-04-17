package P6;

class Animal {
    void move() {
        System.out.println("Animal is moving");
    }
}

class Cheetah extends Animal {
    
    void move() {
        System.out.println("Cheetah runs swiftly");
    }
}

public class Jungle {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.move();

        Cheetah c = new Cheetah();
        c.move();
    }
}
