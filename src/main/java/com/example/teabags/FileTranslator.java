package com.example.teabags;

import java.security.InvalidParameterException;

/**
 * Created by clark on 19/02/2017.
 */
public class FileTranslator
{
    /**
     * Parse the number of bags from the file content
     * @param fileContent
     * @return
     */
    public int parseNumberOfBags(String fileContent)
    {
        String firstLine = getLine(fileContent, 0);
        return Integer.parseInt(firstLine.substring(firstLine.indexOf('-')+1));
    }

    /**
     * Parse the type of tea from the file content
     * @param fileContent
     * @return int
     */
    public int parseTypeOfTea(String fileContent) throws InvalidParameterException
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

    /**
     * Parse the quality of tea from the file content
     * @param fileContent
     * @return
     */
    public int parseQualityOfTea(String fileContent)
    {
        String secondLine = getLine(fileContent, 1);
        return Integer.parseInt(secondLine.substring(secondLine.indexOf('Q')+2));
    }

    /**
     * Parse the shape of bag from the file content
     * @param fileContent
     * @return
     * @throws InvalidParameterException
     */
    public int parseShapeOfBag(String fileContent) throws InvalidParameterException
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

    /**
     * Parse the size of bag from the file content
     * @param fileContent
     * @return
     */
    public int parseSizeOfBag(String fileContent)
    {
        String thirdLine = getLine(fileContent, 2);
        return Integer.parseInt(
                thirdLine.substring(thirdLine.indexOf('-')+1)
        );
    }
}
