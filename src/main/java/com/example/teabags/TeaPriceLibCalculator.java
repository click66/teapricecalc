package com.example.teabags;

/**
 * Tea bag price calculator class
 */
public class TeaPriceLibCalculator implements Calculator
{
    /**
     * Calculate the price of tea bags from the passed parameters
     * @param orderSpecification
     * @return
     */
    public double calculate(OrderSpecification orderSpecification)
    {
        int numberOfTeaBags = orderSpecification.getNumberOfTeaBags();
        int typeOfTea       = orderSpecification.getTypeOfTea();
        int qualityOfTea    = orderSpecification.getQualityOfTea();
        int shapeOfBag      = orderSpecification.getShapeOfBag();
        int sizeOfBag       = orderSpecification.getSizeOfBag();

        return TeaPriceCalc.calculate(numberOfTeaBags, typeOfTea, qualityOfTea, shapeOfBag, sizeOfBag);
    }
}
