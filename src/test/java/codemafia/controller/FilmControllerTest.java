package codemafia.controller;

import codemafia.omdb.controllers.FilmController;
import codemafia.omdb.domain.DBFilm;
import codemafia.omdb.services.DBFilmService;
import org.apache.catalina.User;
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

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(MockitoJUnitRunner.class)
@WebAppConfiguration
public class FilmControllerTest {

    private MockMvc mockMvc;
    private List<DBFilm> films = new ArrayList<>();

    @InjectMocks
    private FilmController controller;

    @Mock
    private DBFilmService service;

    @Before
    public void init() {
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        films.add(DBFilm.builder().id(1L).title("Iron Man").year("2014").imdbID("adcr3526").build());
        Mockito.when(service.displayAll()).thenReturn(films);
    }
    @Test
    public void startTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/start"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(model().attribute("films", films))
                .andExpect(view().name("home"));
    }

}

