// src/services/PaymentService.java
package Service;

import Entity.Account;
import Entity.Invoice;

import java.util.List;
import java.util.stream.Collectors;

public class PaymentService {

    public List<Account> getCustomersWithEnoughBalance(List<Account> accounts, List<Invoice> invoices) {
        return accounts.stream()
                .filter(account -> invoices.stream()
                        .anyMatch(invoice -> invoice.getCustomer().getId() == account.getCustomer().getId()
                                && account.getBalance() >= invoice.getAmount() * (1 - (invoice.getCustomer().getDiscount() / 100.0))))
                .collect(Collectors.toList());
    }

    public List<Account> getCustomersWithNotEnoughBalance(List<Account> accounts, List<Invoice> invoices) {
        return accounts.stream()
                .filter(account -> invoices.stream()
                        .anyMatch(invoice -> invoice.getCustomer().getId() == account.getCustomer().getId()
                                && account.getBalance() < invoice.getAmount()))
                .collect(Collectors.toList());
    }
}

