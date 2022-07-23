package views;

import model.User;

import java.util.HashMap;

import static utils.Rounder.roundValue;

public class UserView {
    public void showAllUser(HashMap<Integer, User> users){
        users.forEach((id,value) -> System.out.printf("""
    id : %d
    name : %s %s
    amount of money : %s
    
    """,id,value.getFirstName(),value.getLastName(),roundValue(value.getAmountOfMoney())));
    }
}
