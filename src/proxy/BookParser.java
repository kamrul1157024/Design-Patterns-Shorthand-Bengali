package proxy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class BookParser implements IBookParser{

    private String descriptionJSON;

    public BookParser(String url)
    {
        descriptionJSON=fetch(url);
    }

    @Override
    public String getDescriptionInJSON() {
        return descriptionJSON;
    }

    String fetch(String url)
    {
        String jsonResponse="";
        try {
            URL yahoo = new URL(url);
            URLConnection yc = yahoo.openConnection();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            yc.getInputStream()));
            String inputLine;

            while ((inputLine = in.readLine()) != null)
                jsonResponse+=inputLine;
            in.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return jsonResponse;
    }
}
