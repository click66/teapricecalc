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
    /**
     * Calculate the price of tea bags from the passed parameters
     * @param orderSpecification
     * @return
     */
    public double calculate(OrderSpecification orderSpecification)
    {
        double result = this.calculator.calculate(orderSpecification);

        if (orderSpecification.getNumberOfTeaBags() > 8000000 && result > 100000) {
            result = result * 0.985;
        }

        return result;
    }
}
