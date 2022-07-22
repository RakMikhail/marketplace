package model;

import utils.AppStarter;
import views.UserView;

import java.util.HashMap;

public class AppModel {
    private int choice;

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public void showUsers(){
    UserView userView = new UserView();
    userView.showAllUser(getUsers());
    AppStarter.startApp();
    }

    public void showProducts(){

    }
    public void buyProduct(){

    }
    public void showListOfProductsByUser(){

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
}
