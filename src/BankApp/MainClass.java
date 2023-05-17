package BankApp;

import BankApp.Accounts.Saving;
import BankApp.Customer.Business;
import BankApp.Customer.Personal;

public class MainClass {
    public static void main(String[] args) {

        Bank bank = new Bank("Techno Bank");
        bank.addCustomer(new Personal("Jason",120000));
        /* Create a checking account for Jason and deposit $200 and withdraw $50. Check the balance. It must be $150
        * Withdraw $150 and then try to delete this account. You must see the success message
        * Create a saving account for this customer, deposit $200, withdraw $50 and apply interest. Check the balance. It must be $151.7425
        * Try to delete this account. You must see "You have $151.7425 in your account. Withdraw your money first" message
        * Create a credit account for this customer, deposit $200, withdraw $50. Check the balance. It must be $142.5
        * Withdraw $200 and try to delete this account. You must see "You cannot close credit account without paying your debt" message
        * Try to delete this customer. You must see "This customer has either money or debt in one of his/her accounts." message
        */
        bank.customers.get(0).openAccount("checking");
        bank.customers.get(0).getAccounts().get(0).addMoney(200);
        bank.customers.get(0).getAccounts().get(0).withdrawMoney(50);
        //System.out.println( bank.customers.get(0).getAccounts().get(0).getBalance());
        bank.customers.get(0).getAccounts().get(0).withdrawMoney(150);
        bank.customers.get(0).deleteAccount(bank.customers.get(0).getAccounts().get(0));
        bank.customers.get(0).openAccount("saving");
        bank.customers.get(0).getAccounts().get(0).addMoney(200);
        bank.customers.get(0).getAccounts().get(0).withdrawMoney(50);
        ((Saving)(bank.customers.get(0).getAccounts().get(0))).applyInterest();
        System.out.println( bank.customers.get(0).getAccounts().get(0).getBalance());
        bank.customers.get(0).deleteAccount(bank.customers.get(0).getAccounts().get(0));
        bank.customers.get(0).openAccount("credit");
        bank.customers.get(0).getAccounts().get(1).addMoney(200);
        bank.customers.get(0).getAccounts().get(1).withdrawMoney(50);
        System.out.println( bank.customers.get(0).getAccounts().get(1).getBalance());
        bank.customers.get(0).getAccounts().get(1).withdrawMoney(200);
        bank.customers.get(0).deleteAccount(bank.customers.get(0).getAccounts().get(1));
        bank.deleteCustomer(bank.customers.get(0));


        bank.addCustomer(new Business("Google",50000000));
        /* Create a checking account for Google. Deposit $200 and withdraw $200. Try to delete this customer.
         * You must see "Customer has been deleted successfully" message
         */
        bank.customers.get(1).openAccount("checking");
        bank.customers.get(1).getAccounts().get(0).addMoney(200);
        bank.customers.get(1).getAccounts().get(0).withdrawMoney(200);
        bank.deleteCustomer(bank.customers.get(1));
    }
}
