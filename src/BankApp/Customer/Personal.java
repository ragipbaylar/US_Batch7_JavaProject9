package BankApp.Customer;

import BankApp.Accounts.Account;
import BankApp.Accounts.Checking;
import BankApp.Accounts.Credit;
import BankApp.Accounts.Saving;

public class Personal extends Customer{
    private int annualSalary;

    public Personal(String customerName, int annualSalary) {
        super(customerName);
        this.annualSalary = annualSalary;
        this.creditLimit = setCreditLimit(annualSalary);
    }

    /* This class extends Account class. It has private int annualSalary variable.
     * Create a constructor with parameters String customerName and int annualSalary.
     * Assign annualSalary to annualSalary.
     *
     * Create a setCreditLimit method with an int annualSalary parameter. Return type is double.
     * Set creditLimit to its %10 in setCreditLimit and assign it to creditLimit variable in the constructor.
     *
     * Implement all necessary methods.
     *
     * In openAccount method
     *           if accountType is checking, create a checking account and add it to the accounts list.
     *           if accountType is saving, create a saving account and add it to the accounts list.
     *           if accountType is credit, create a credit account and add it to the accounts list.
     */

    public int getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public double setCreditLimit(int annualSalary) {
        return annualSalary*0.1;
    }

    @Override
    public void openAccount(String accountType) {
        Account account;
        if (accountType.equalsIgnoreCase("checking")){
            account = new Checking();
            accounts.add(account);
            System.out.println("Checking account has been successfully opened");
        }else if (accountType.equalsIgnoreCase("saving")){
            account = new Saving();
            accounts.add(account);
            System.out.println("Saving account has been successfully opened");
        }else if (accountType.equalsIgnoreCase("credit")){
            account = new Credit(creditLimit);
            accounts.add(account);
            System.out.println("Credit account has been successfully opened");
        }
    }
}
