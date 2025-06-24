package summerpep2.OOPS.Inheritance1;

public class Client {
    public static void main(String[] args){
        System.out.println("Inside inheritence client");
        Dog a1 = new Dog();
        a1.makeSound();
        Animal a2 = new Cat();
        a2.makeSound();
        Dog d2 = new Dog();
        d2.makeSound();
    }
}
