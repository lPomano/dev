import java.io.*;

/**
 * Programs entery point
 */
public class Main {
    private static final String HTMLNAME = "Table.html";

    /**
     * Method main works with other classes
     */
    public static void main(String[] args) throws IOException {
        File newFile = new File(HTMLNAME);
        HtmlFile file = new HtmlFile();
        HtmlFile htmlFile = new HtmlFile();
        HtmlFileInformation inf = new HtmlFileInformation();
        htmlFile.putInformation(inf.getName(), inf.getType(), inf.getDateOfCreation(), inf.getSize());
        saveToFile(newFile, file.getTable());
    }

    /**
     * Saves information to file "Table.html"
     */
    public static void saveToFile(File file, String htmlFile) throws IOException {
        PrintWriter out = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file), "utf-8"));
        out.write(htmlFile);
        out.close();
    }
}