package com.ntqsolution;

import com.ntqsolution.controller.Shape;
import com.ntqsolution.model.Circle;
import com.ntqsolution.model.Rectangle;
import com.ntqsolution.model.Triangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            menu();
            try {
                Shape shape;
                choose = Integer.parseInt(scanner.nextLine().trim());
                while (choose > 3 || choose < 0) {
                    System.out.println("Please re-choose: ");
                    choose = Integer.parseInt(scanner.nextLine().trim());
                }
                switch (choose) {
                    case 1:
                        shape = new Rectangle();
                        shape.input();
                        shape.draw();
                        break;

                    case 2:
                        shape = new Circle();
                        shape.input();
                        shape.draw();
                        break;

                    case 3:
                        shape = new Triangle();
                        shape.input();
                        shape.draw();
                        break;
                }
            } catch (NumberFormatException e) {
                System.err.println("This input is invalid. Please re-input!!!");
                choose = 1;
            }
        } while (choose != 0);
    }

    public static void menu() {
        System.out.println("Calculation shape: " + "\n" +
                "1. Rectangle " + "\n" +
                "2. Circle" + "\n" +
                "3. Triangle" + "\n" +
                "Please choose shape need calculate: ");
    }

}
