package summerpep2.Interfaces;

interface Flyable {
    void fly();
}

interface Walkable {
    void walk();
}

interface Swimmable {
    void swim();
}

abstract class Bird {
    protected String name;

    public Bird(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public abstract void makeSound();
}

class Penguin extends Bird implements Walkable, Swimmable {
    public Penguin(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println(name + " says: Honk!");
    }

    public void walk() {
        System.out.println(name + " is walking.");
    }

    public void swim() {
        System.out.println(name + " is swimming.");
    }
}

class Ostrich extends Bird implements Walkable {
    public Ostrich(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println(name + " says: Boom!");
    }

    public void walk() {
        System.out.println(name + " is walking.");
    }
}

class Duck extends Bird implements Walkable, Swimmable, Flyable {
    public Duck(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println(name + " says: Quack!");
    }

    public void walk() {
        System.out.println(name + " is walking.");
    }

    public void swim() {
        System.out.println(name + " is swimming.");
    }

    public void fly() {
        System.out.println(name + " is flying.");
    }
}

public class BirdWorld {
    public static void main(String[] args) {
        Bird[] birds = {
            new Penguin("Penny"),
            new Ostrich("Oscar"),
            new Duck("Daisy")
        };
        for (Bird bird : birds) {
            bird.eat();
            bird.makeSound();
            if (bird instanceof Flyable) {
                ((Flyable) bird).fly();
            }
            if (bird instanceof Walkable) {
                ((Walkable) bird).walk();
            }
            if (bird instanceof Swimmable) {
                ((Swimmable) bird).swim();
            }
            System.out.println();
        }
    }
}
