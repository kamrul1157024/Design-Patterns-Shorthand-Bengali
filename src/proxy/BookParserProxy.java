package proxy;

public class BookParserProxy implements IBookParser{

    private BookParser bookParser=null;
    private String url;
    public BookParserProxy(String url)
    {
        this.url=url;
    }
    @Override
    public String getDescriptionInJSON() {
        if (bookParser==null) bookParser=new BookParser(this.url);
        return bookParser.getDescriptionInJSON();
    }
}
