package SOLID;
class Student {
    private String name;
    private int age;
    private String department;
    private String email;
    private String phone;
    private Student(StudentBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.department = builder.department;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    public String toString() {
        return "Student [Name=" + name + ", Age=" + age + ", Department=" + department +
               ", Email=" + email + ", Phone=" + phone + "]";
    }

    public static class StudentBuilder {
        private String name;
        private int age;
        private String department;
        private String email;
        private String phone;

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public StudentBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
