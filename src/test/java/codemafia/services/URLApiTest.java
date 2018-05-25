package codemafia.services;

import codemafia.omdb.services.URLApiServiceImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class URLApiTest {

    URLApiServiceImpl urlApi = new URLApiServiceImpl();

    @Test
    public void searchURLTest() {
        String str = "http://www.omdbapi.com/?apikey=588de52d&s=iron";
        assertEquals(str, urlApi.getSearchURL("iron"));
    }

    @Test
    public void detailsURLTest() {
        String str = "http://www.omdbapi.com/?apikey=588de52d&i=12345";
        assertEquals(str, urlApi.getDetailsURL("12345"));
    }
}
