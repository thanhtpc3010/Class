package Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;
    private LocalDateTime datetime;

    public Invoice(){;}

    public Invoice(int id, Customer customer, double amount, LocalDateTime datetime) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
        this.datetime = datetime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", customer=" + customer +
                ", amount=" + amount +
                ", datetime=" + datetime +
                '}';
    }

    public LocalDateTime getDateTime() {

        return datetime;
    }
}
