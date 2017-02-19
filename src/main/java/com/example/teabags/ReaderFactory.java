package com.example.teabags;

import java.io.FileNotFoundException;

/**
 * Created by clark on 18/02/2017.
 */
public class ReaderFactory
{

    public Reader make(String file) throws FileNotFoundException
    {
        if (file == null) {
            return new InputReader();
        }
        return new FileReader(file);
    }
}
