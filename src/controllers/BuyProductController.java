package controllers;

import model.Product;
import model.User;
import utils.ChoiceValidator;
import utils.NotEnoughMoneyException;

import java.util.HashMap;
import java.util.Scanner;


public class BuyProductController {

    Scanner scanner = new Scanner(System.in);
    int userChoice;
    int productChoice;
    User user;
    Product product;

    public HashMap<Integer, User> buyProduct(HashMap<Integer, User> users, HashMap<Integer, Product> products) {
        System.out.println("Choice user id :");
        userChoice = ChoiceValidator.validation(scanner, users.keySet());
        user = users.get(userChoice);

        System.out.println("Choice product id :");
        productChoice = ChoiceValidator.validation(scanner, products.keySet());
        product = products.get(productChoice);
        try {
            if (user.getAmountOfMoney() < product.getPrice()) {
                throw new NotEnoughMoneyException();
            }
        } catch (NotEnoughMoneyException exception) {
            System.out.println("not enough money!");
            return users;
        }

        users.get(userChoice).setAmountOfMoney(user.getAmountOfMoney() - product.getPrice());
        users.get(userChoice).addProduct(product);
        product.addToList(user);
        System.out.printf("Congratulation, %s, you bought a %s\n", user.getFirstName(), product.getName());
        return users;


    }
}
