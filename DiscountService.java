package Service;

import Entity.Invoice;

import java.util.List;
import java.util.stream.Collectors;

public class DiscountService {

    public List<Invoice> applyAdditionalDiscount(List<Invoice> invoices) {
        return invoices.stream()
                .filter(invoice -> invoice.getCustomer().getGender().equalsIgnoreCase("f")
                        && invoice.getDateTime().getMonthValue() == 8)
                .peek(invoice -> invoice.getCustomer().setDiscount(invoice.getCustomer().getDiscount() + 10))
                .collect(Collectors.toList());
    }
}

