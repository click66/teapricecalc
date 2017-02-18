package com.example.teabags;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

/**
 * Tests for TeaPriceCalculator calss
 */
public class TeaPriceCalculatorTest
{
    Mockery context = new Mockery();

    /**
     * Test object construction
     */
    @Test
    public void testConstruct()
    {
        TeaPriceCalculator teaPriceCalculator = new TeaPriceCalculator(context.mock(Calculator.class));

        assertNotNull(teaPriceCalculator);
    }

    /**
     * Test calculate method
     */
    @Test
    public void testCalculate()
    {
        int numberOfTeaBags = 1;
        int typeOfTea       = 2;
        int qualityOfTea    = 3;
        int shapeOfBag      = 4;
        int sizeOfBag       = 5;

        double calculatedCost = 42;

        Calculator calculator = context.mock(Calculator.class);
        context.checking(new Expectations() {{
            oneOf (calculator).calculate(numberOfTeaBags, typeOfTea, qualityOfTea, shapeOfBag, sizeOfBag);
                will(returnValue(calculatedCost));
        }});

        TeaPriceCalculator teaPriceCalculator = new TeaPriceCalculator(calculator);

        assertEquals(calculatedCost, teaPriceCalculator.calculate(
                numberOfTeaBags,
                typeOfTea,
                qualityOfTea,
                shapeOfBag,
                sizeOfBag
        ), 0);
    }

    /**
     * Test that if the teabag count is over eight million and price over one hundred thousand, the price
     * is reduced by 1.5%
     */
    @Test
    public void testCalculateOverMillion()
    {
        // Constant values
        int typeOfTea       = 2;
        int qualityOfTea    = 3;
        int shapeOfBag      = 4;
        int sizeOfBag       = 5;

        // Boundary test
        int numberOfTeaBags = 8000001;            // Number of tea bags over 8 million
        double calculatedCost = 100010;           // Calculated cost of over 100000
        double expectedCalculatedCost = 98509.85; // Expected calculated cost (100010 - 1.5% = 98509.85)

        Calculator calculator = context.mock(Calculator.class);
        context.checking(new Expectations() {{
            oneOf (calculator).calculate(numberOfTeaBags, typeOfTea, qualityOfTea, shapeOfBag, sizeOfBag);
            will(returnValue(calculatedCost));
        }});

        TeaPriceCalculator teaPriceCalculator = new TeaPriceCalculator(calculator);

        assertEquals(expectedCalculatedCost, teaPriceCalculator.calculate(
                numberOfTeaBags,
                typeOfTea,
                qualityOfTea,
                shapeOfBag,
                sizeOfBag
        ), 0);
    }
}
