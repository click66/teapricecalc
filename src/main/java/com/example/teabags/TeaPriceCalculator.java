package com.example.teabags;

/**
 * Decorated Tea Price Calculator
 */
public class TeaPriceCalculator implements Calculator
{
    private Calculator calculator;

    /**
     * TeaPriceCalculator constructor
     */
    public TeaPriceCalculator(Calculator calculator)
    {
        this.calculator = calculator;
    }

    @Override
    public double calculate(int numberOfTeaBags, int typeOfTea, int qualityOfTea, int shapeOfBag, int sizeOfBag)
    {
        return this.calculator.calculate(
                numberOfTeaBags,
                typeOfTea,
                qualityOfTea,
                shapeOfBag,
                sizeOfBag
        );
    }
}
