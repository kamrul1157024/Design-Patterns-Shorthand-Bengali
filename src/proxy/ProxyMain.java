package proxy;

public class ProxyMain {
    public static void main(String[] args) {
        String url="https://openlibrary.org/works/OL45883W.json";

        BookParserProxy bookParserProxy=new BookParserProxy(url);
        System.out.println("Object Created!");
        System.out.println(bookParserProxy.getDescriptionInJSON());
    }
}
