package BankApp.Accounts;

public class Saving extends Account {

    private double interestRate;

    public Saving() {
        super("saving");
        this.interestRate = 0.015;
    }

    /* This class extends Account class. It has extra private double interestRate variable.
    * Create a constructor without any variables. Pass "saving" string to super constructor.
    * assign %1.5 to interest rate in the constructor.
    *
    * Implement necessary methods.
    *
    * In addMoney method add amount to balance variable if it is equal or greater than 0, otherwise print "You cannot add negative amount"
    *
    * In withdrawMoney method subtract amount plus a fee of 0.01 of the amount from balance if the balance is bigger than total amount, otherwise
    * print "Insufficient balance"
    *
    * In applyInterest method increase the balance by interestRate times itself.
    *
    * */

    @Override
    public void addMoney(int amount) {
        if (amount>=0){
            this.balance += amount;
        }else {
            System.out.println("You cannot add negative amount");
        }
    }

    @Override
    public void withdrawMoney(int amount) {
        if (this.balance >= (amount+amount*0.01)){
            this.balance -=(amount+amount*0.01);
        }else {
            System.out.println("Insufficient balance");
        }
    }
    public void applyInterest(){
        this.balance+=this.balance*this.interestRate;
    }
}
