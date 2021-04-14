package templateMethodPattern;

public class TemplateMain {

    public static void main(String[] args) {
        DocumentAnalyzer htmlDocumentAnalyzer=new HTMLDocumentAnalyzer();
        htmlDocumentAnalyzer.analyzeText("src/templateMethodPattern/sonar_tori.html");

        DocumentAnalyzer textDocumentAnalyzer=new TextDocumentAnalyzer();
        textDocumentAnalyzer.analyzeText("src/templateMethodPattern/kobor_kobita.txt");
    }

}
