package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Product {
    private final int id;
    private final String name;
    private final double price;
    private Set<User> listOfUsers = new HashSet<User>();

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Set<User> getListOfUsers() {
        return listOfUsers;
    }

    public void addToList(User user) {
        listOfUsers.add(user);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
