package codemafia.omdb.services;

import codemafia.omdb.domain.FilmDetails;

public interface FilmDetailsService {
    FilmDetails getFilm(String id);
}
