package Chapter06_OOPS;

public class Cat extends Animal {

    String breed;

    public Cat(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }
    
    @Override
    public void makeSound(){
        System.out.println("Meow Meow");
    }
}
