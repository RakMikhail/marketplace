package controllers;

import model.Product;
import model.User;
import utils.ChoiceValidator;
import utils.EmptyShoppingListException;
import utils.NoBuyersException;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ListUsersController {

    Scanner scanner = new Scanner(System.in);
    Product product;
    Set<User> list;

    public Set<User> checkList(HashMap<Integer, Product> products) {
        System.out.println("Choice product id :");
        int choice = ChoiceValidator.validation(scanner, products.keySet());
        product = products.get(choice);
        list = product.getListOfUsers();
        if (list.isEmpty()) {
            return null;
        }
        System.out.printf("all users who bought the product %s : \n", product.getName());
        return list;
    }


    public void showList(HashMap<Integer, Product> products) {
        int count = 1;
        try {
            list = checkList(products);
            if (list == null) {
                throw new NoBuyersException();
            }
            for (User user : list
            ) {
                System.out.println(count + ". " + user.getFirstName() + " " + user.getLastName());
                count++;
            }
        } catch (NoBuyersException noBuyersException) {
            System.out.println("no buyers");
        }


    }
}
