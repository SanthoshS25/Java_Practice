package Chapter06_OOPS;

public class Dog extends Animal{
    
    String breed;
    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }
    public void bark(){
        System.out.println(name + " is Barking and the breed is " + breed);
    }

    @Override
    public void makeSound(){
        System.out.println("Bow Bow");
    }
}
