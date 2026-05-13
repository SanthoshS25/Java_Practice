package Chapter06_OOPS;

public class Student {
    // Properties
    String name;
    int age;
    String college;

    // Behavior
    void study() {
        System.out.println(name + " is studying!");
    }

    void introduce() {
        System.out.println("Hi I am " + name +
                " and I am " + age +
                " years old!");
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Santhosh"; s1.age = 22; s1.college = "KCG College";
        Student s2 = new Student();
        s2.name = "Ravi"; s2.age = 22; s2.college = "KCG College";
        s1.introduce();s2.introduce();
        s1.study(); s2.study();

    }
}
