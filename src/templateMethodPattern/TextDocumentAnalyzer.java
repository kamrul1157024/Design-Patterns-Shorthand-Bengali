package templateMethodPattern;

import java.io.*;
import java.util.Scanner;

public class TextDocumentAnalyzer extends DocumentAnalyzer{
    @Override
    public String getTextFromFile(String filePath) {
        String text="";
        try(Scanner scanner=new Scanner(new File(filePath)))
        {
            while (scanner.hasNextLine()) text+=scanner.nextLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return text;
    }
}
