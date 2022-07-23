package views;

import model.Product;
import model.User;

import java.util.HashMap;

import static utils.Rounder.roundValue;

public class ProductView {

    public void showAllProducts(HashMap<Integer, Product>products){
        products.forEach((id,value) -> System.out.printf("""
    id : %d
    name : %s
    price : %s
    
    """,id,value.getName(),roundValue(value.getPrice())));
    }
}
