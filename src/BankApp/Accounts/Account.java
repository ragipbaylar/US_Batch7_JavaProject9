package BankApp.Accounts;

public abstract class Account {
    protected String accountNumber;
    protected double balance;
    protected String accountType;

    public Account(String accountType){
        this.balance = 0;
        this.accountNumber = setAccountNumber();
        this.accountType = setAccountType(accountType);
    }

    /*
    * This class is an abstract class.
    * Create the fields below and their getters and setters
    *
    * private String accountNumber;
    * private double balance;
    * private String accountType;
    *
    * Create a constructor with a String accountType parameter.
    * Set balance to 0 in the constructor
    *
    * Assign a random number between 1000000-10000000 to accountNumber.
    * Create this number in setAccountNumber method and return the number. Assign it to accountNumber in the constructor by
    * calling setAccountNumber method.
    *
    * In the setAccountType method change the return type to String and pass the String accountType parameter that you are getting by the constructor to this method
    * and make it all uppercase and assign it to objects accountType variable.
    *
    * Create 2 public abstract methods, names are addMoney and withdrawMoney. No return type
    * addMoney and withdrawMoney have double amount parameter.
    *
    * */

    public String getAccountNumber() {
        return accountNumber;
    }

    public String setAccountNumber() {
        int accountNumber = (int) (Math.random() * ((10000000 - 1000000) + 1)) + 1000000;
        return Integer.toString(accountNumber);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public String setAccountType(String accountType) {
        return accountType.toUpperCase();
    }

    public abstract void addMoney(int amount);
    public abstract void withdrawMoney(int amount);
}
