package codemafia.omdb.services;

import codemafia.omdb.domain.DBFilm;
import codemafia.omdb.domain.FilmDetails;
import codemafia.omdb.repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DBFilmServiceImp implements DBFilmService {

    @Autowired
    private FilmRepository filmRepository;

    @Autowired
    private FilmDetailsService filmDetailsService;

    @Override
    public void add(String id) {
        FilmDetails filmDetails = filmDetailsService.getFilm(id);
        DBFilm film = new DBFilm.Builder()
                .title(filmDetails.getTitle())
                .year(filmDetails.getYear())
                .imdbID(filmDetails.getImdbID())
                .build();

        filmRepository.save(film);
    }

    @Override
    public void update(DBFilm film) {
        filmRepository.save(film);
    }

    @Override
    public void remove(Long id) {
        filmRepository.delete(id);
    }

    @Override
    public List<DBFilm> displayAll() {
        return (List<DBFilm>) filmRepository.findAll();
    }
}
