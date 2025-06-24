package summerpep2.OOPS.Inheritance1;
import java.util.*;

class PersonInheritance {
    String name;
    int age;

    public PersonInheritance(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends PersonInheritance {
    int roll;
    int[] marks;

    public Student(String name, int age, int roll, int n) {
        super(name, age);
        this.roll = roll;
        this.marks = new int[n];
    }

    public void enterMarks(Scanner sc) {
        System.out.println("Enter marks for " + marks.length + " subjects:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
    }

    public double calculateAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }

    @Override
    public String toString() {
        return "Name: " + name +
               "\nAge: " + age +
               "\nRoll No: " + roll +
               "\nAverage Marks: " + calculateAverage();
    }
}
class MainInheritance {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = s.next();

        System.out.print("Enter age: ");
        int age = s.nextInt();

        System.out.print("Enter roll number: ");
        int roll = s.nextInt();

        System.out.print("Enter number of subjects: ");
        int n = s.nextInt();

        Student st = new Student(name, age, roll, n);
        st.enterMarks(s);

        System.out.println("\nStudent Details:\n" + st); // Automatically calls toString()
    }
}
