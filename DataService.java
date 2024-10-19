
package Controller;

import Entity.Account;
import Entity.Customer;
import Entity.Invoice;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<Customer> customers = new ArrayList<>();
    private List<Account> accounts = new ArrayList<>();
    private List<Invoice> invoices = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void addInvoice(Invoice invoice) {
        invoices.add(invoice);
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }
}

