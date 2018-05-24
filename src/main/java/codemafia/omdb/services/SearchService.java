package codemafia.omdb.services;

import codemafia.omdb.domain.FilmList;

public interface SearchService {
    FilmList getList(String title);
}
