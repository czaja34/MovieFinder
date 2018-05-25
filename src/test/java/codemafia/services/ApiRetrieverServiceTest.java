package codemafia.services;

import codemafia.filmsForTest.DetailsFilmForTest;
import codemafia.filmsForTest.FilmForTest;
import codemafia.omdb.domain.FilmDetails;
import codemafia.omdb.domain.FilmList;
import codemafia.omdb.services.ApiRetrieverServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApiRetrieverServiceTest {

    ApiRetrieverServiceImpl apiRetrieverService;

    FilmList filmList;
    FilmDetails filmDetails;

    @Before
    public void init() {
        apiRetrieverService = new ApiRetrieverServiceImpl();
        FilmForTest filmForTest = new FilmForTest();
        filmList = filmForTest.filmList();

        filmDetails = new FilmDetails();
        DetailsFilmForTest detailsFilmForTest = new DetailsFilmForTest();
        filmDetails = detailsFilmForTest.detailsFilm();
    }

    @Test
    public void searchApiRetrieverTest() {
        assertEquals(filmList, apiRetrieverService.searchApiRetriever("http://www.omdbapi.com/?apikey=588de52d&s=good bye my"));
    }

    @Test
    public void detailsApiRetrieverTest() {
        assertEquals(filmDetails, apiRetrieverService.detailsApiRetriever("http://www.omdbapi.com/?apikey=588de52d&i=tt0049271"));
    }

}
