package codemafia.omdb.controllers;

import codemafia.omdb.domain.FilmList;
import codemafia.omdb.domain.SearchInstance;
import codemafia.omdb.services.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FilmSearchController {

    @Autowired
    private SearchService searchService;

    @GetMapping("/search")
    public String searchForFilm() {
        return "search";
    }

    @RequestMapping("/result")
    public String result(Model model, @RequestParam(name = "title") String title) {
        SearchInstance.getInstance().setTitle(title);
        FilmList films = searchService.getList(title);
        model.addAttribute("results", films.getAllFilms());
        return "getList";
    }
}
