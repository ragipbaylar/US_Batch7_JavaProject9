package BankApp.Accounts;

public class Checking extends Account {
    public Checking() {
        super("checking");
    }


    /* This class extends Account class. It has no additional variables.
    * Create a constructor without any parameters. Pass "checking" string argument to the super.
    *
    * Implement all necessary methods.
    *
    * In addMoney method add amount to balance if it is equal or greater than 0, otherwise print "You cannot add negative amount"
    *
    * In withdrawMoney method subtract amount from balance if balance is greater than amount, otherwise print "Insufficient balance"
    *
    * In applyInterest method print "No interests for this account"
    *
    *
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
        if (this.balance >= amount){
            this.balance -=amount;
        }else {
            System.out.println("Insufficient balance");
        }
    }
}
