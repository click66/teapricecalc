package com.example.teabags;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by clark on 18/02/2017.
 */
public class FileReader implements Reader
{
    private String file;

    private FileTranslator translator;

    public FileReader(String file, FileTranslator fileTranslator)
    {
        this.file = file;
        this.translator = fileTranslator;
    }

    public OrderSpecification readOrder() throws FileNotFoundException
    {
        String fileContent = this.getFileContent();

        int numberOfTeaBags = translator.parseNumberOfBags(fileContent);
        int typeOfTea = translator.parseTypeOfTea(fileContent);
        int qualityOfTea = translator.parseQualityOfTea(fileContent);
        int shapeOfBag = translator.parseShapeOfBag(fileContent);
        int sizeOfBag = translator.parseSizeOfBag(fileContent);

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

}
