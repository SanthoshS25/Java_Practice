package Chapter06_OOPS;

public class Main {
    public static void main(String[] args) {
        // //Object Creation
        // BankAccount customer1 = new BankAccount();

        // // Value given to that object
        // customer1.setAccountNumber(123456789);
        // customer1.setHolderName("Ravi");
        // customer1.setBalance(1000);

        // //getting the value
        // System.out.println(customer1.getAccountNumber());
        // System.out.println(customer1.getHolderName());
        // System.out.println(customer1.getBalance());

        // // doing necessary actions
        // customer1.deposit(5000);
        // customer1.withdraw(2000);


        //Object Creation
        Dog dog1 = new Dog("Labrador",2,"BigDog");
        dog1.eat();
        dog1.sleep();
        dog1.bark();
        dog1.makeSound();
        Cat cat1 = new Cat("Street Cat", 1, "Normal");
        cat1.eat();
        cat1.sleep();
        cat1.makeSound();
    }
}
