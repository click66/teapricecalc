package com.example.teabags;

import org.jmock.Mockery;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Tests for FileTranslator class
 */
public class FileTranslatorTest
{
    Mockery context = new Mockery();

    private String testFileContent = "eg-500\nQ=4\nd-5";

    /**
     * Test object construction
     */
    @Test
    public void testConstruct()
    {
        FileTranslator translator = new FileTranslator();

        assertNotNull(translator);
    }

    @Test
    public void testParseNumberOfBags()
    {
        FileTranslator translator = new FileTranslator();

        assertEquals(500, translator.parseNumberOfBags(testFileContent));
    }

    @Test
    public void testParseTypeOfTea()
    {
        FileTranslator translator = new FileTranslator();

        assertEquals(1, translator.parseTypeOfTea(testFileContent));
    }

    @Test
    public void testParseQualityOfTea()
    {
        FileTranslator translator = new FileTranslator();

        assertEquals(4, translator.parseQualityOfTea(testFileContent));
    }

    @Test
    public void testParseShapeOfBag()
    {
        FileTranslator translator = new FileTranslator();

        assertEquals(3, translator.parseShapeOfBag(testFileContent));
    }

    @Test
    public void testParseSizeOfBag()
    {
        FileTranslator translator = new FileTranslator();

        assertEquals(5, translator.parseSizeOfBag(testFileContent));
    }
}
