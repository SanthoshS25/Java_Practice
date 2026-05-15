package Chapter06_OOPS;

public class Student {
    // Properties
    String name;
    int age;
    static String college;

    public Student(String name, int age, String college) {
        this.name = name;
        this.age = age;
        this.college = college;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.college = "Govt College";
    }

    // Behavior
    void study() {
        System.out.println(name + " is studying! in " + college);
    }

    void introduce() {
        System.out.println("Hi I am " + name +
                " and I am " + age +
                " years old!");
    }

    public static void main(String[] args) {
        // Student s1 = new Student();
        // s1.name = "Santhosh"; s1.age = 22; s1.college = "KCG College";
        // Student s2 = new Student();
        // s2.name = "Ravi"; s2.age = 22; s2.college = "KCG College";
        Student s1 = new Student("Santhosh", 22, "KCG College");
        Student s2 = new Student("Ravi", 22);
        System.out.println(s1.name + " - " + s1.college);
        System.out.println(s2.name + " - " + s2.college);

        // Now change collegeName
        college = "Anna University";

        System.out.println(s1.name + " - " + s1.college);
        System.out.println(s2.name + " - " + s2.college);
        // s1.introduce();
        // s2.introduce();
        // s1.study();
        // s2.study();

    }
}
