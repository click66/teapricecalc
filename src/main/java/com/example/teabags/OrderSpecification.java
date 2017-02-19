package com.example.teabags;

/**
 * OrderSpecification value object
 * Created by clark on 18/02/2017.
 */
public class OrderSpecification
{
    private int numberOfTeaBags;
    private int typeOfTea;
    private int qualityOfTea;
    private int shapeOfBag;
    private int sizeOfBag;

    /**
     * OrderSpecification constructor
     * @param numberOfTeaBags
     * @param typeOfTea
     * @param qualityOfTea
     * @param shapeOfBag
     * @param sizeOfBag
     */
    public OrderSpecification(
            int numberOfTeaBags,
            int typeOfTea,
            int qualityOfTea,
            int shapeOfBag,
            int sizeOfBag
    ) {
        this.numberOfTeaBags = numberOfTeaBags;
        this.typeOfTea       = typeOfTea;
        this.qualityOfTea    = qualityOfTea;
        this.shapeOfBag      = shapeOfBag;
        this.sizeOfBag       = sizeOfBag;
    }

    public int getNumberOfTeaBags()
    {
        return numberOfTeaBags;
    }

    public int getTypeOfTea()
    {
        return typeOfTea;
    }

    public int getQualityOfTea()
    {
        return qualityOfTea;
    }

    public int getShapeOfBag()
    {
        return shapeOfBag;
    }

    public int getSizeOfBag()
    {
        return sizeOfBag;
    }
}
