package BankApp.Customer;

import BankApp.Accounts.Account;
import BankApp.Accounts.Checking;
import BankApp.Accounts.Credit;

public class Business extends Customer{
    private int annualNetIncome;
    public Business(String customerName, int annualNetIncome) {
        super(customerName);
        this.annualNetIncome = annualNetIncome;
        this.creditLimit = setCreditLimit(this.annualNetIncome);
    }

    /* This class extends Account class. It has private int annualIncome variable.
    * Create a constructor with parameters String customerName and int annualNetIncome.
    * Assign annualIncome to annualIncome.
    *
    * Create a setCreditLimit method with an int annualIncome parameter. Return type is double.
    * Set creditLimit to its %30 setCreditLimit and assign it to creditLimit variable in the constructor.
    *
    * Implement all necessary methods.
    *
    * In openAccount method
    *           if accountType is checking, create a checking account and add it to the accounts list.
    *           if accountType is saving, print "Business customers cannot have saving accounts"
    *           if accountType is credit, create a credit account and add it to the accounts list.
    */
    public double setCreditLimit(int annualIncome) {
        return annualIncome*0.30;
    }

    @Override
    public void openAccount(String accountType) {
        Account account;
        if (accountType.equalsIgnoreCase("checking")){
            account = new Checking();
            accounts.add(account);
        }else if (accountType.equalsIgnoreCase("saving")){
            System.out.println("Business customers cannot have saving accounts");
        }else if (accountType.equalsIgnoreCase("credit")){
            account = new Credit(creditLimit);
            accounts.add(account);
        }
    }
}
