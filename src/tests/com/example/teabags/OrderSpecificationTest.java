package com.example.teabags;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Tests for OrderSpecificationTest class
 */
public class OrderSpecificationTest
{
    /**
     * Test object construction
     */
    @Test
    public void testConstruct()
    {
        OrderSpecification orderSpecification = new OrderSpecification(1, 1, 1, 1, 1);

        assertNotNull(orderSpecification);
    }

    @Test
    public void testGetNumberOfTeaBags()
    {
        int numberOfTeaBags = 747;
        OrderSpecification orderSpecification = new OrderSpecification(numberOfTeaBags, 1, 1, 1, 1);

        assertEquals(numberOfTeaBags, orderSpecification.getNumberOfTeaBags());
    }

    @Test
    public void testGetTypeOfTea()
    {
        int typeOfTea = 3;
        OrderSpecification orderSpecification = new OrderSpecification(1, typeOfTea, 1, 1, 1);

        assertEquals(typeOfTea, orderSpecification.getTypeOfTea());
    }

    @Test
    public void testGetQualityOfTea()
    {
        int qualtyOfBag = 747;
        OrderSpecification orderSpecification = new OrderSpecification(1, 1, qualtyOfBag, 1, 1);

        assertEquals(qualtyOfBag, orderSpecification.getQualityOfTea());
    }

    @Test
    public void testGetShapeOfBag()
    {
        int shapeOfBag = 747;
        OrderSpecification orderSpecification = new OrderSpecification(1, 1, 1, shapeOfBag, 1);

        assertEquals(shapeOfBag, orderSpecification.getShapeOfBag());
    }

    @Test
    public void testGetSizeOfBag()
    {
        int sizeOfBag = 747;
        OrderSpecification orderSpecification = new OrderSpecification(1, 1, 1, 1, sizeOfBag);

        assertEquals(sizeOfBag, orderSpecification.getSizeOfBag());
    }
}
