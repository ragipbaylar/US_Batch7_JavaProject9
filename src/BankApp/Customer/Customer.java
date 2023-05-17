package BankApp.Customer;

import BankApp.Accounts.Account;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer {

    protected String customerNumber;
    protected String customerName;
    protected double creditLimit;
    protected List<Account> accounts;

    public Customer(String customerName) {
        this.customerName = customerName;
        this.customerNumber = setCustomerNumber();
        this.accounts = new ArrayList<>();
    }

    /* This class is an abstract class.
     * Create the fields below and their getters and setters
     *
     * private String customerNumber;
     * private String customerName;
     * private double creditLimit;
     * private List<Account> accounts
     *
     * Create a constructor with customerName parameter and assign it to customerName variable.
     *
     * Assign a random number between 1000000-10000000 to customerNumber.
     * Create this number in setCustomerNumber method and return the number. Assign it to customerNumber in the constructor by
     * calling setCustomerNumber method.
     *
     * Initialize accounts list as an ArrayList in the construction.
     *
     * Create an abstract openAccount method with a String accountType parameter.
     *
     * Create a non-abstract deleteAccount method with an Account parameter.
     * Delete this account from accounts list if its balance is 0.
     * If the balance is negative print "You cannot close credit account without paying your debt"
     * If the balance is positive print "You have $balance in your account. Withdraw your money first"
     *
     *
     *
     */

    public String getCustomerNumber() {
        return customerNumber;
    }

    public String setCustomerNumber() {
        int accountNumber = (int) (Math.random() * ((10000000 - 1000000) + 1)) + 1000000;
        return Integer.toString(accountNumber);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void deleteAccount(Account account) {
        if (account.getBalance() == 0) {
            accounts.remove(account);
            System.out.println("This account has been deleted successfully");
        } else if (account.getBalance()<0) {
            System.out.println("You cannot close credit account without paying your debt");
        }else {
            System.out.println("You have $"+account.getBalance()+" in your account. Withdraw your money first");
        }
    }
    public abstract void openAccount(String accountType);
}
