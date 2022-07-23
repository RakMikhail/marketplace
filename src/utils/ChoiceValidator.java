package utils;


import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class ChoiceValidator {
    public static int validation(Scanner scanner, Set<Integer> keys) {

        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - not a number!\nTry again: ", str);
        }
        String str1 = null;

        int choice = scanner.nextInt();
        while (!keys.contains(choice)) {
            System.out.println("no such value!\nTry again: ");
            while (!scanner.hasNextInt()) {
                System.out.println("wrong input \nTry again: ");
                try {
                    str1 = scanner.next().trim();
                } catch (InputMismatchException ime) {
                    System.out.printf("\"%s\" - not a number!%nTry again: ", str1);
                }
            }
            choice = scanner.nextInt();
        }
        return choice;

    }


}
