package com.example.teabags;

import java.io.File;
import java.io.FileNotFoundException;
import java.security.InvalidParameterException;
import java.util.Scanner;

/**
 * Created by clark on 18/02/2017.
 */
public class FileReader implements Reader
{
    private String file;

    public FileReader(String file)
    {
        this.file = file;
    }

    public OrderSpecification readOrder() throws FileNotFoundException
    {
        String fileContent = this.getFileContent();

        int numberOfTeaBags = parseNumberOfBags(fileContent);
        int typeOfTea = parseTypeOfTea(fileContent);
        int qualityOfTea = parseQualityOfTea(fileContent);
        int shapeOfBag = parseShapeOfBag(fileContent);
        int sizeOfBag = parseSizeOfBag(fileContent);

        return new OrderSpecification(numberOfTeaBags, typeOfTea, qualityOfTea, shapeOfBag, sizeOfBag);
    }

    /**
     * Read the entire file into a string
     * @return String
     * @throws FileNotFoundException
     */
    private String getFileContent() throws FileNotFoundException
    {
        return new Scanner(new File(this.file))
                .useDelimiter("\\Z").next();
    }

    private int parseNumberOfBags(String fileContent)
    {
        String firstLine = getLine(fileContent, 0);
        return Integer.parseInt(firstLine.substring(firstLine.indexOf('-')+1));
    }

    /**
     * Translate the alphanumeric identifier of a tea type into the numeric ID
     * @param fileContent
     * @return int
     */
    private int parseTypeOfTea(String fileContent) throws InvalidParameterException
    {
        String identifier = fileContent.substring(0, fileContent.indexOf('-'));

        switch (identifier) {
            case "eg":
                return 1;
            case "eb":
                return 2;
            case "ls":
                return 3;
        }
        throw new InvalidParameterException("Invalid type of tea specified");
    }

    private int parseQualityOfTea(String fileContent)
    {
        String secondLine = getLine(fileContent, 1);
        return Integer.parseInt(secondLine.substring(secondLine.indexOf('Q')+2));
    }

    private int parseShapeOfBag(String fileContent) throws InvalidParameterException
    {
        String thirdLine = getLine(fileContent, 2);
        String identifier = thirdLine.substring(0, thirdLine.indexOf('-'));

        switch (identifier) {
            case "s":
                return 1;
            case "c":
                return 2;
            case "d":
                return 3;
        }
        throw new InvalidParameterException("Invalid shape of bag specified");
    }

    private int parseSizeOfBag(String fileContent)
    {
        String thirdLine = getLine(fileContent, 2);
        return Integer.parseInt(
                thirdLine.substring(thirdLine.indexOf('-')+1)
        );
    }

    /**
     * Get specified line of the file
     * @param fileContent Content to parse
     * @param line        Zero-indexed line number
     * @return
     */
    private String getLine(String fileContent, int line)
    {
        String[] lines = fileContent.split("\\r?\\n");
        if (lines.length <= line) {
            throw new InvalidParameterException("Inaccessible file line");
        }
        return lines[line];
    }
}
