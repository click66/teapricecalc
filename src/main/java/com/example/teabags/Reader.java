package com.example.teabags;

import java.io.FileNotFoundException;

/**
 * Created by clark on 18/02/2017.
 */
public interface Reader
{
    public OrderSpecification readOrder() throws FileNotFoundException;
}
