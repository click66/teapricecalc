package com.example.teabags;

/**
 * Tea bag price calculator class
 */
public class TeaPriceCalculator
{
    /**
     * Calculate the price of tea bags from the passed parameters
     * @param numberOfTeaBags
     * @param typeOfTea
     * @param qualityOfTea
     * @param shapeOfBag
     * @param sizeOfBag
     * @return
     */
    public double calculate(int numberOfTeaBags, int typeOfTea, int qualityOfTea, int shapeOfBag, int sizeOfBag)
    {
        return TeaPriceCalc.calculate(numberOfTeaBags, typeOfTea, qualityOfTea, shapeOfBag, sizeOfBag);
    }
}
