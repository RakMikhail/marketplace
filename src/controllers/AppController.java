package controllers;

import model.AppModel;
import views.AppView;

public class AppController {

    AppModel model;
    AppView view;

    public AppController(AppModel model, AppView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {
        filterChoice(view.doChoice());
    }

    private void filterChoice(int choice) {
        switch (choice) {
            case 1 -> {
                model.showUsers();
                runApp();
            }
            case 2 -> {
                model.showProducts();
                runApp();
            }
            case 3 -> {
                model.buyProduct();
                runApp();
            }
            case 4 -> {
                model.showListOfProductsByUser();
                runApp();
            }
            case 5 -> {
                model.showListOfUsersByProduct();
                runApp();
            }
            case 0 -> {
                String output = "\n>> App has closed.";
                view.getOutput(output, choice);
            }
            default -> throw new IllegalStateException("Unexpected value: " + choice);
        }
    }
}
