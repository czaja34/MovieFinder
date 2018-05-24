package codemafia.omdb.services;

import codemafia.omdb.domain.DBFilm;

import java.util.List;

public interface DBFilmService {
    void add(String id);
    void update(DBFilm film);
    void remove(Long id);
    List<DBFilm> displayAll();
}
