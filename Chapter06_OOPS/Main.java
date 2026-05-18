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
        Dog dog1 = new Dog();
        dog1.name = "Labrador";
        dog1.age = 2;
        dog1.eat();
        dog1.sleep();
        dog1.bark();
    }
}
