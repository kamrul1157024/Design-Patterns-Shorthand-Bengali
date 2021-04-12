package bridge;

import bridge.models.Artist;
import bridge.models.Book;
import bridge.resource.ArtistResource;
import bridge.resource.BookResource;
import bridge.view.ActualView;
import bridge.view.IView;
import bridge.view.ShortView;

public class BridgeMain {

    public static void main(String[] args) {

        //Creating Model

        Artist artist= new Artist(
                "Arnob",
                "Something about him",
                "https://demo.com/artist/arnob");

        Book book= new Book(
                "Gitanjali",
                "This book written by Rabindranath thakur",
                "https://demo.com/book/gitajali");


        IView bookShortView= new ShortView(new BookResource(book));
        IView bookActualView= new ActualView(new BookResource(book));

        System.out.println(bookShortView.showHTML());
        System.out.println(bookActualView.showHTML());


        IView artistShortView= new ActualView(new ArtistResource(artist));
        IView artistLongView= new ShortView(new ArtistResource(artist));

        System.out.println(artistShortView.showHTML());
        System.out.println(artistLongView.showHTML());
    }
}
