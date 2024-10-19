// src/services/SearchService.java
package Service;

import Entity.Account;
import Entity.Invoice;

import java.util.List;
import java.util.Optional;

public class SearchService {

    public Optional<Account> getAccountById(List<Account> accounts, int id) {
        return accounts.stream()
                .filter(account -> account.getId() == id)
                .findFirst();
    }

    public Optional<Account> getAccountByCustomerName(List<Account> accounts, String name) {
        return accounts.stream()
                .filter(account -> account.getCustomer().getName().equalsIgnoreCase(name))
                .findFirst();
    }

    public Optional<Invoice> getInvoiceById(List<Invoice> invoices, int id) {
        return invoices.stream()
                .filter(invoice -> invoice.getId() == id)
                .findFirst();
    }

    public Optional<Invoice> getInvoiceByCustomerName(List<Invoice> invoices, String name) {
        return invoices.stream()
                .filter(invoice -> invoice.getCustomer().getName().equalsIgnoreCase(name))
                .findFirst();
    }
}

