package bridge.resource;

import bridge.models.Book;
public class BookResource implements IResource{

    private final Book book;

    public BookResource(Book book)
    {
        this.book=book;
    }

    @Override
    public String getTitle() {
        return book.getName();
    }

    @Override
    public String getSnippet() {
        return book.getDetails();
    }

    @Override
    public String getUrl() {
        return book.getBookUrl();
    }
}
