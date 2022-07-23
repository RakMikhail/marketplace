package model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final int id;
    private  String firstName;
    private  String lastName;
    private double amountOfMoney;

    private List<Product> listOfProducts = new ArrayList<>();

    public User(int id, String firstName, String lastName, double amountOfMoney) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.amountOfMoney = amountOfMoney;
    }

    public void addProduct(Product product){
        listOfProducts.add(product);
    }

    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }
}
