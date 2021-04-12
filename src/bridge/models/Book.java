package bridge.models;

public class Book {
    private final String name;
    private final String details;
    private final String bookUrl;

    public Book(String name,String details,String bookUrl)
    {
        this.name=name;
        this.details=details;
        this.bookUrl=bookUrl;
    }

    public String getName() {
        return name;
    }

    public String getDetails() {
        return details;
    }

    public String getBookUrl() {
        return bookUrl;
    }
}
