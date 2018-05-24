package codemafia.omdb.services;

import codemafia.omdb.domain.FilmDetails;
import codemafia.omdb.domain.FilmList;

public interface ApiRetrieverService {

    FilmList searchApiRetriever(String url);
    FilmDetails detailsApiRetriever(String id);

}
