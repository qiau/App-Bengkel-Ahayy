package models;

import java.util.ArrayList;

public class Booking {
    private String bookingId;
    private Mechanic mechanic;
    private Customer customer;
    private ArrayList<Sparepart> spareparts;
    private String problem;
    private double price;

    public Booking(String bookingId, Mechanic mechanic, Customer customer, 
            String problem) {
        this.bookingId = bookingId;
        this.mechanic = mechanic;
        this.customer = customer;
        this.problem = problem;
    }

    public String getBookingId() {
        return bookingId;
    }

    public Mechanic getMechanic() {
        return mechanic;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ArrayList<Sparepart> getSpareparts() {
        return spareparts;
    }

    public String getProblem() {
        return problem;
    }

    public double getPrice() {
        return price;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public void setMechanic(Mechanic mechanic) {
        this.mechanic = mechanic;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setSpareparts(ArrayList<Sparepart> spareparts) {
        this.spareparts = spareparts;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
