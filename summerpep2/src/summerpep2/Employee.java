package summerpep2;
import java.util.*;

public class Employee {
	String name;
	int age;
	
	Employee(String name, int age){
		this.name=name;
		this.age=age;
}
	public void updateAge(int newAge) {
        this.age = newAge;
        System.out.println("Updated age to: " + this.age);
    }
    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
public static void main(String []args) {
	Employee em=new Employee("vishnu",20);
	em.display();

    em.updateAge(25); 
    em.display();
}
}
