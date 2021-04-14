package templateMethodPattern;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HTMLDocumentAnalyzer extends DocumentAnalyzer{
    @Override
    public String getTextFromFile(String filePath) {
        String text="";
        try(Scanner scanner=new Scanner(new File(filePath)))
        {
            while (scanner.hasNextLine()) text+=scanner.nextLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //Removing the HTML text
        text=text.replaceAll("<[a-z]+>|<\\/[a-z]+>","");
        return text;
    }

    @Override
    public void beforeAll() {
        System.out.println("Processing a HTML Document!");
    }
}
