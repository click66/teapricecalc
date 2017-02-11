package com.example.teabags;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        if (args.length == 1) { // a file name has been specified
            // Nobody uses this code yet
            // You will have to implement something
            String fileName = args[0];
            String fileContent = new Scanner(new File(fileName))
                    .useDelimiter("\\Z").next();
            System.out.println("fileContent = " + fileContent);
            // fileContent should be parsed but isn't ...
            double number = TeaPriceCalc.calculate(1, 1, 1, 1, 1);
            System.out.println("price to charge = £" +
                    new DecimalFormat("#.00").format(number));
            return;
        }

        System.out.println("Tea bag price calculator.");
        System.out.println("Enter details and I'll tell you how much to charge for the complete order");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of tea bags");
        int numberOfTeaBags = scan.nextInt();

        System.out.println("Type of tea");
        // 1 = earl grey
        // 2 = english breakfast
        // 3 = lapsang souchong
        int typeOfTea = scan.nextInt();

        System.out.println("Quality of tea");
        // 1 = highest ... 20 = lowest
        int qualityOfTea = scan.nextInt();

        System.out.println("Shape of tea bags");
        // 1 = square, 2 = circular, 3 = dodecahedron
        int shapeOfBag = scan.nextInt();

        System.out.println("Size of tea bags");
        // number of grams of tea per bag, between 1 - 5
        int sizeOfBag = scan.nextInt();

        double number = TeaPriceCalc.calculate(numberOfTeaBags, typeOfTea, qualityOfTea, shapeOfBag, sizeOfBag);
        System.out.println("price to charge = £" +
                new DecimalFormat("#.00").format(number));
    }
}
