package codemafia.controller;

import codemafia.filmsForTest.DetailsFilmForTest;
import codemafia.filmsForTest.FilmForTest;
import codemafia.omdb.controllers.FilmDetailsController;
import codemafia.omdb.domain.FilmDetails;
import codemafia.omdb.domain.FilmList;
import codemafia.omdb.services.FilmDetailsService;
import codemafia.omdb.services.SearchService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;


@RunWith(MockitoJUnitRunner.class)
@WebAppConfiguration
public class FilmDetailsControllerTest {
    private MockMvc mockMvc;
    private FilmDetails film;
    private FilmList filmList;

    @InjectMocks
    private FilmDetailsController controller;

    @Mock
    private FilmDetailsService service;
    @Mock
    private SearchService searchService;

    @Before
    public void init() {
        FilmForTest filmForTest = new FilmForTest();
        DetailsFilmForTest filmDetails = new DetailsFilmForTest();
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        film = filmDetails.detailsFilm();
        filmList = filmForTest.filmList();
        Mockito.when(service.getFilm("dknc32")).thenReturn(film);
        Mockito.when(searchService.getList("Iron")).thenReturn(filmList);
    }
    @Test//ten test sam jeszcze nie ogarnałem czmu nie działa
    public void resultTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/return"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(model().attribute("results", filmList))
                .andExpect(view().name("getList"));
    }
    @Test
    public void filmDetailsTest() throws Exception {
        String iD = "dknc32";
        mockMvc.perform(MockMvcRequestBuilders.get("/details").
                param("iD", iD))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(model().attribute("film", film))
                .andExpect(view().name("movieDetails"));
    }
    @Test
    public void filmdetailTest() throws Exception {
        String iD = "dknc32";
        mockMvc.perform(MockMvcRequestBuilders.get("/showMovie").
                param("iD", iD))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(model().attribute("film", film))
                .andExpect(view().name("showMovieTmp"));
    }



}
