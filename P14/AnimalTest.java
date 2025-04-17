// Problem Statement:
// Write a Java program that defines an abstract class called Animal.
// create two subclasses of Animal:
// - Dog: A subclass that implements the makeSound() method to print "Woof".
// - Cat: A subclass that implements the makeSound() method to print "Meow".
// In the main method, create objects of Dog and Cat, and call their respective methods.
 
package P14;
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    public void makeSound() {
        System.out.println(getName() + " says Woof");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println(getName() + " says Meow");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");

        dog.makeSound(); 
        cat.makeSound(); 
    }
}
