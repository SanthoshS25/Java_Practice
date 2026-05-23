package Chapter06_OOPS;

public class CreditCard implements Payable,Printable,Loggable {
    String userName;
    double balance;
    String cardNumber;

    public CreditCard(String userName, double balance, String cardNumber){
        this.userName = userName;
        this.balance = balance;
        this.cardNumber = cardNumber;
    }

    public void processPayment(double amount){
        balance+=amount;
        System.out.println("The Payments is being processing");
    }

    public void printReceipt(){
        System.out.println("The given amount is been added in the card Number" + cardNumber);
    }

    public void logTransaction(){
        System.out.println("The transaction is being done and total balance: "+ balance);
    }


}
