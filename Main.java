import Controller.DataService;
import Entity.Account;
import Entity.Customer;
import Entity.Gender;
import Entity.Invoice;
import Service.DiscountService;
import Service.PaymentService;
import Service.SearchService;
import Service.SortService;

import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataService dataService = new DataService();
        SortService sortService = new SortService();
        SearchService searchService = new SearchService();
        PaymentService paymentService = new PaymentService();
        DiscountService discountService = new DiscountService();

        // Tạo các đối tượng mẫu
        Customer c1 = new Customer(1, "Alice", Gender.F);
        Customer c2 = new Customer(2, "Bob", Gender.M);
        Account a1 = new Account(1, c1, 1000);
        Account a2 = new Account(2, c2, 500);
        Invoice i1 = new Invoice(1, c1, 800, LocalDateTime.now());
        Invoice i2 = new Invoice(2, c2, 600, LocalDateTime.now());

        // Thêm vào danh sách
        dataService.addCustomer(c1);
        dataService.addCustomer(c2);
        dataService.addAccount(a1);
        dataService.addAccount(a2);
        dataService.addInvoice(i1);
        dataService.addInvoice(i2);

        // Liệt kê khách hàng có đủ tiền để thanh toán hóa đơn
        List<Account> accountsWithEnoughBalance = paymentService.getCustomersWithEnoughBalance(dataService.getAccounts(), dataService.getInvoices());
        System.out.println("Khách hàng có đủ số dư:");
        accountsWithEnoughBalance.forEach(System.out::println);

        // Áp dụng giảm giá thêm cho khách hàng nữ trong tháng 8
        List<Invoice> discountedInvoices = discountService.applyAdditionalDiscount(dataService.getInvoices());
        System.out.println("Khách hàng được giảm giá thêm 10% trong tháng 8:");
        discountedInvoices.forEach(System.out::println);
    }
}