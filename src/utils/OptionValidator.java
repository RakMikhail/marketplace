package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OptionValidator {

    public static int validatorOption(Scanner scanner) {

        int[] menuChoices = {0, 1, 2, 3, 4, 5};
        int inputData;
        String str1 = null;

        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - not a number!%nTry again: ", str);
        }
        inputData = scanner.nextInt();

        while (!contains(menuChoices, inputData)) {
            System.out.println("Не верное значение, попробуйте еще раз.");
            while (!scanner.hasNextInt()) {
                try {
                    str1 = scanner.next().trim();
                } catch (InputMismatchException ime) {
                    System.out.printf("\"%s\" - not a number!%nTry again: ", str1);
                }
            }
            inputData = scanner.nextInt();
        }
        return inputData;
    }

    public static boolean contains(int[] nums, int number) {
        boolean result = false;
        for (int numb : nums) {
            if (numb == number) {
                result = true;
                break;
            }
        }
        return result;
    }
}
