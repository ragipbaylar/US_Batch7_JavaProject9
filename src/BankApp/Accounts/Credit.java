package BankApp.Accounts;

public class Credit extends Account{

    private double creditLimit;
    private double transactionFee;

    public Credit(double creditLimit) {
        super("credit");
        this.creditLimit = creditLimit;
        this.transactionFee = 0.03;
    }

    /* This class extends Account class. It has private double creditLimit and private double transactionFee variables.
    * Create a constructor with creditLimit parameter. Pass "credit" value to the super. assign creditLimit coming from the constructor to the creditLimit variable
    * and set the transactionFee to %3
    *
    * Implement all necessary methods.
    *
    * In addMoney method decrease the amount by %transactionFee and add it to the balance if the amount is equal or bigger than 0,
    * otherwise print "You cannot add negative amount".
    *
    * In withdrawMoney method decrease balance by amount and %transactionFee of the amount if balance is equal or greater than the total amount,
    * otherwise print "Insufficient balance"
    *
    * In applyInterest method print "No interests for this account"
    *
    *
    * */
    @Override
    public void addMoney(int amount) {
        if (amount > 0) {
            this.balance += (amount - amount * transactionFee);
        }else {
            System.out.println("You cannot add negative amount");
        }
    }

    @Override
    public void withdrawMoney(int amount) {
        if (amount <= balance+creditLimit){
            this.balance -= (amount+amount* transactionFee);
        }else {
            System.out.println("Insufficient balance");
        }
    }
}
