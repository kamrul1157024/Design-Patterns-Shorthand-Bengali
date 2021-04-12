package bridge.models;

public class Artist {
    private final String name ;
    private final String bio;
    private final String informationUrl;

    public Artist(String name,String bio,String informationUrl)
    {
        this.name=name;
        this.bio=bio;
        this.informationUrl=informationUrl;
    }

    public String getName() {
        return name;
    }

    public String getBio() {
        return bio;
    }

    public String getInformationUrl() {
        return informationUrl;
    }
}
