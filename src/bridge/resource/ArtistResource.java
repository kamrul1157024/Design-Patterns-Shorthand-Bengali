package bridge.resource;

import bridge.models.Artist;

public class ArtistResource implements IResource{

    private final Artist artist;

    public ArtistResource(Artist artist)
    {
        this.artist=artist;
    }

    @Override
    public String getTitle() {
        return artist.getName();
    }

    @Override
    public String getSnippet() {
        return artist.getBio();
    }

    @Override
    public String getUrl() {
        return artist.getInformationUrl();
    }
}
