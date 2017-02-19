package com.example.teabags;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

/**
 * Tests for ReaderFactory class
 */
public class ReaderFactoryTest
{
    Mockery context = new Mockery();

    /**
     * Test object construction
     */
    @Test
    public void testConstruct()
    {
        ReaderFactory factory = new ReaderFactory();

        assertNotNull(factory);
    }

    /**
     * Test that the factory will return an InputReader if called without a file
     */
    @Test
    public void testReadInput() throws FileNotFoundException
    {
        ReaderFactory factory = new ReaderFactory();

        assertTrue(factory.make(null) instanceof InputReader);
    }

    /**
     * Test that the factory will return a FileReader if called with a file
     */
    @Test
    public void testReadFile() throws FileNotFoundException
    {
        ReaderFactory factory = new ReaderFactory();

        assertTrue(factory.make("file.txt") instanceof FileReader);
    }
}
