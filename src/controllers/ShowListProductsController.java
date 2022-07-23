package controllers;

import model.Product;
import model.User;
import utils.ChoiceValidator;
import utils.EmptyShoppingListException;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ShowListProductsController {

    Scanner scanner = new Scanner(System.in);
    User user;
    List<Product> list;

    public List<Product> checkList(HashMap<Integer, User> users){
        System.out.println("Choice user id :");
        int choice = ChoiceValidator.validation(scanner,users.keySet());
        user = users.get(choice);
        list = user.getListOfProducts();
        if (list.isEmpty()){
            return null;
        }
        System.out.printf("all products purchased by the user %s %s : \n",user.getFirstName(),user.getLastName());
        return list;
    }


    public void showList(HashMap<Integer, User> users){
        int count = 1;
        try {
            list = checkList(users);
            if (list == null){
                throw new EmptyShoppingListException();
            }
            for (Product product: list
            ) {
                System.out.println(count +". "+ product.getName());
                count++;
            }
        }catch (EmptyShoppingListException emptyShoppingListException){
            System.out.println("empty shopping list");
        }


    }
}
