package codemafia.omdb.controllers;

import codemafia.omdb.domain.SearchInstance;
import codemafia.omdb.services.DBFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class FilmController {
    private String redirectHome = "redirect:home";

    @Autowired
    private DBFilmService filmService;

    @RequestMapping("/add")
    public String add() {
        String id = SearchInstance.getInstance().getId();
        filmService.add(id);
        return redirectHome;
    }

    @RequestMapping("/remove")
    public String remove(Model model) {
        model.addAttribute("films", filmService.displayAll());
        return "remove";
    }

    @RequestMapping("/removeFilm")
    public String remove(@RequestParam Long id) {
        filmService.remove(id);
        return redirectHome;
    }

    @RequestMapping("redirect:home")
    public String redirectHome() {
        return redirectHome;
    }

    @RequestMapping("/start")
    public String displayAllFilms(Map<String, Object> model) {
        model.put("films", filmService.displayAll());
        return "home";
    }
}
