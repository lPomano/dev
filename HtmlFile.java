import java.io.File;

/**
 * Class creates Html table and fills it.
 */
public class HtmlFile {
    File file = new File("");
    private static String Table =
            "<!DOCTYPE html>\n"+ "<html lang=\"ru\">\n"+"<head>\n"+ "<title>Table</title>\n"
            +"<meta charset=\"utf-8\">\n"+"</head>\n"+"<body text\"" + "#000000" + "\">\n"
            +"<table bordercolor=\"" + "#ffffff" + "\">\n"+"<tr valign=\"top\" bgcolor=\"" + "#cecfce" + "\">\n"
            +"<th width=\"125px\">" + "»Ãﬂ" + "</th>\n"+"<th width=\"125px\">" + "“»œ" + "</th>\n"
            +"<th width=\"125px\">" + "ƒ¿“¿ —Œ«ƒ¿Õ»ﬂ" + "</th>\n"+"<th width=\"125px\">" + "–¿«Ã≈– (‚ Kb)"
            +"</th>\n"+"</tr>\n";

    /**
    * Method putInformation put information about name, type, fate and size of file in our
    * working directory
    */
    public void putInformation(String name, String type, java.nio.file.attribute.FileTime date, double size) {
        if (file.isDirectory()) {
            Table += "<tr bgcolor=\"" + "#efefef" + "\">\n";
        } else {
            Table += "<tr bgcolor=\"" + "#f7f7f7" + "\">\n";
        }
        Table="<td>" + name + "</td>\n"+"<td>" + type + "</td>\n"+"<td>" + date + "</td>\n"
                + "<td>" + size + "</td>\n"+"</tr>\n";
    }

    /**
     * Return out Html table.
     */
    public String getTable() {
        return Table;
    }
}