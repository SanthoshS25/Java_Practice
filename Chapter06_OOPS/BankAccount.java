package Chapter06_OOPS;

public class BankAccount {
    
    private long accountNumber;
    private String holderName;
    private double balance;

    // Getters
    public long getAccountNumber(){
        return accountNumber;
    }

    public String getHolderName(){
        return holderName;
    }

    public double getBalance(){
        return balance;
    }

    //Setters
    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setHolderName(String holderName){
        this.holderName = holderName;
    }

    public void setBalance(double balance){
        if (balance > 0){
            this.balance = balance;
        }
        else{
            System.out.println("Invalid Amount");
        }
    }

    //Deposit
    public void deposit(double amount){
        balance+=amount;
        System.out.println("The amount is credited");
    }

    //Withdraw
    public void withdraw(double amount){
        if(balance > amount){
            balance-= amount;
            System.out.println("The amount is Withdrawn");
        }
        else{
            System.out.println("Insufficient balance");
        }
    }


}
