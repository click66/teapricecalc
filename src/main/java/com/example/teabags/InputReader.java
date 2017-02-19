package com.example.teabags;

import java.util.Scanner;

/**
 * Created by clark on 18/02/2017.
 */
public class InputReader implements Reader
{
    private boolean read = false;

    private int numberOfTeaBags;
    private int typeOfTea;
    private int qualityOfTea;
    private int shapeOfBag;
    private int sizeOfBag;

    /**
     * Read in all user input
     */
    public OrderSpecification readOrder()
    {
        // Read in and cache all the values

        System.out.println("Tea bag price calculator.");
        System.out.println("Enter details and I'll tell you how much to charge for the complete order");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of tea bags");
        this.numberOfTeaBags = getInput(scan);

        System.out.println("Type of tea");
        // 1 = earl grey
        // 2 = english breakfast
        // 3 = lapsang souchong
        this.typeOfTea = getInput(scan);

        System.out.println("Quality of tea");
        // 1 = highest ... 20 = lowest
        this.qualityOfTea = getInput(scan);

        System.out.println("Shape of tea bags");
        // 1 = square, 2 = circular, 3 = dodecahedron
        this.shapeOfBag = getInput(scan);

        System.out.println("Size of tea bags");
        // number of grams of tea per bag, between 1 - 5
        this.sizeOfBag = getInput(scan);

        return new OrderSpecification(
                this.numberOfTeaBags,
                this.typeOfTea,
                this.qualityOfTea,
                this.shapeOfBag,
                this.sizeOfBag
        );
    }

    /**
     * Get user input
     * @param scan
     * @return
     */
    private static int getInput(Scanner scan)
    {
        return scan.nextInt();
    }
}
