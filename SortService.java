// src/services/SortService.java
package Service;

import Entity.Account;
import Entity.Customer;
import Entity.Invoice;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortService {

    public List<Customer> sortCustomersByName(List<Customer> customers) {
        return customers.stream()
                .sorted(Comparator.comparing(Customer::getName))
                .collect(Collectors.toList());
    }

    public List<Account> sortAccountsByCustomerName(List<Account> accounts) {
        return accounts.stream()
                .sorted(Comparator.comparing(a -> a.getCustomer().getName()))
                .collect(Collectors.toList());
    }

    public List<Invoice> sortInvoicesByDateTime(List<Invoice> invoices) {
        return invoices.stream()
                .sorted(Comparator.comparing(Invoice::getDateTime))
                .collect(Collectors.toList());
    }
}

