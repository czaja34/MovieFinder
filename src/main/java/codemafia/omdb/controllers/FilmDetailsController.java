package codemafia.omdb.controllers;

import codemafia.omdb.domain.SearchInstance;
import codemafia.omdb.domain.FilmDetails;
import codemafia.omdb.domain.FilmList;
import codemafia.omdb.services.FilmDetailsService;
import codemafia.omdb.services.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FilmDetailsController {

    @Autowired
    private FilmDetailsService filmDetailsService;

    @Autowired
    private SearchService searchService;

    @GetMapping("/showMovie")
    public String filmDetail(Model model, @RequestParam String iD) {
        SearchInstance.getInstance().setId(iD);
        FilmDetails film = filmDetailsService.getFilm(iD);
        model.addAttribute("film", film);
        return "showMovie";
    }

    @RequestMapping("/details")
    public String filmDetails(Model model, @RequestParam String iD) {
        SearchInstance.getInstance().setId(iD);
        FilmDetails film = filmDetailsService.getFilm(iD);
        model.addAttribute("film", film);
        return "movieDetails";
    }

    @RequestMapping("/return")
    public String result(Model model) {
        String title = SearchInstance.getInstance().getTitle();
        FilmList films = searchService.getList(title);
        model.addAttribute("results", films.getAllFilms());
        return "getList";
    }
}
