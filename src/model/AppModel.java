package model;

import controllers.BuyProductController;
import controllers.ShowListProductsController;
import views.ProductView;
import views.UserView;

import java.util.HashMap;

public class AppModel {
    private int choice;
    private HashMap<Integer,User> users = getUsers();

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public void showUsers(){
    UserView userView = new UserView();
    userView.showAllUser(users);
    }

    public void showProducts(){
        ProductView productView = new ProductView();
        productView.showAllProducts(getProducts());
    }
    public void buyProduct(){
        BuyProductController buyingView = new BuyProductController();
        users = buyingView.buyProduct(users,getProducts());
    }
    public void showListOfProductsByUser(){
        ShowListProductsController showListProducts = new ShowListProductsController();
        showListProducts.showList(users);

    }
    public void showListOfUsersByProduct(){

    }

    public static HashMap<Integer,User> getUsers(){
        HashMap<Integer,User> users = new HashMap<>();
        User user1 = new User(1,"Mikhailo","Rak",100.50);
        User user2 = new User(2,"Vadym","Polishchuk",150.50);
        User user3 = new User(3,"Andrii","Bodnar",80.50);
        users.put(user1.getId(), user1);
        users.put(user2.getId(), user2);
        users.put(user3.getId(), user3);
        return users;
    }

    public static HashMap<Integer,Product> getProducts(){
        HashMap<Integer,Product> products = new HashMap<>();
        Product product1 = new Product(1,"Apple",5.1);
        Product product2 = new Product(2,"Pineapple",6.7);
        Product product3 = new Product(3,"Watermelon",70.2);
        products.put(product1.getId(), product1);
        products.put(product2.getId(), product2);
        products.put(product3.getId(), product3);
        return products;
    }
}
