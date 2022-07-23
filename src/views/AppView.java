package views;

import model.AppModel;
import utils.OptionValidator;

import java.util.Scanner;

public class AppView {
    AppModel model;
    Scanner scanner;
    int choice;

    public AppView(AppModel model) {
        this.model = model;
    }

    public int doChoice() {
        int opinion;
        scanner = new Scanner(System.in);
        System.out.println("""
                        
                ______ MENU ___________
                1.- View users.
                2.- View products.
                3.- Buy product.
                4.- User product list.
                5.- Product user list.
                        
                0.- Close app.
                """);

        choice = OptionValidator.validatorOption(scanner);
        model.setChoice(choice);
        opinion = model.getChoice();
        return opinion;
    }

    public void getOutput(String output, int choice) {
        if (choice == 0) System.out.println(output);
        scanner.close();
        System.exit(0);
    }


}
