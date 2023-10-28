/* Терновская Е.В.
 * 1к 15.1гр Таск 5 Вариант 20
 * w >= 3 (в примере ниже: w = 14) */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static int checkInput() {
        Scanner scanner = new Scanner((System.in));
        int input = 0;

        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("\nPlease, input the weight of the figure (weight >= 3):");
                input = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect input (invalid type)!");
                scanner.nextLine();
                continue;
            }
            if (input < 3) {
                System.out.println("Incorrect input (weight >= 3)!");
                validInput = false;
            }
        }
        return input;
    }

    public static void main(String[] args) {
        System.out.println("""
                Welcome to program Painting the figure:
                 ------------
                |!           |
                | !!         |
                |   !!!      |
                |      !!!!  |
                |          !!|
                |      !!!!  |
                |   !!!      |
                | !!         |
                |!           |
                 ------------""");

        for (int weight = 3; weight < 50; weight++) {
            System.out.println("\n\nweight = " + weight + ":");
            Figure.paintingFigure(weight);
        }

        int weight = checkInput();
        Figure.paintingFigure(weight);
    }

}