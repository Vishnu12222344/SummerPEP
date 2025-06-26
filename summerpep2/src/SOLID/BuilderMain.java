package SOLID;

public class BuilderMain {
    public static void main(String[] args) {
        Student student1 = new Student.StudentBuilder()
                                .setName("Pratapani Vishnu")
                                .setAge(21)
                                .setDepartment("Computer Science")
                                .setEmail("pratapanivishnu@gmail.com")
                                .setPhone("6300515068")
                                .build();

        System.out.println(student1);
    }
}
