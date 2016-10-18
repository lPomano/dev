import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Class HtmlFileInformation work with files in our working directory
 */
public class HtmlFileInformation {
    File files = new File("");

    /**
     * Method getType work with files in our working directory and return their types
     */
    public String getType() {
        if (files.isDirectory()) {
            return "";
        }
        if (files.isFile()) {
            return "";
        }
        return "";
    }

    /**
     * Method getName work with files in our working directory and return their names
     */
    public String getName() {
        String name;
        File file = new File("");
        name = file.getName();
     return name;
    }

    /**
     * Method getSize work with files in our working directory and return their sizes
     */
    public double getSize() {
        return files.length()/1024;
    }

    /**
     * Method getDateOfCreation work with files in our working directory and return their date
     * of creation
     */
    public java.nio.file.attribute.FileTime getDateOfCreation() throws IOException {
        Path date = files.toPath();
        BasicFileAttributes attr = Files.readAttributes(date, BasicFileAttributes.class);
        return attr.creationTime();
    }
}
