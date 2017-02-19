package com.example.teabags;

import java.text.DecimalFormat;

public class App {
    /**
     * Main application class
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // Instantiate the calculator
        TeaPriceCalculator calculator = new TeaPriceCalculator(new TeaPriceLibCalculator());
        // Instantiate the reader factory
        ReaderFactory readerFactory = new ReaderFactory();

        // Read the order
        String file = args.length == 1 ? args[0] : null;
        Reader orderReader = readerFactory.make(file);

        double number = calculator.calculate(orderReader.readOrder());

        // Print out price
        System.out.println("price to charge = £" +
                new DecimalFormat("#.00").format(number));

    }
}
