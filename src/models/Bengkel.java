package models;

import java.util.ArrayList;

public class Bengkel {
    private final ArrayList<Admin> admin;
    private final ArrayList<Customer> customer;
    private final ArrayList<Sparepart> sparepart;
    
    public Bengkel() {
        admin = new ArrayList<>();
        customer = new ArrayList<>();
        sparepart = new ArrayList<>();
    }
}
