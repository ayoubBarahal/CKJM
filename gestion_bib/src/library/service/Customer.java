package library.service;

import java.util.ArrayList;
import java.util.List;
import library.model.Lendable;

public class Customer {
    private String name;
    private List<Lendable> checkedOutItems;

    public Customer(String name) {
        this.name = name;
        checkedOutItems = new ArrayList<>();
    }


}