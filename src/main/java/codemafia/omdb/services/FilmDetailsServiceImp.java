package codemafia.omdb.services;

import codemafia.omdb.domain.FilmDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmDetailsServiceImp implements FilmDetailsService {

    @Autowired
    private URLApiService urlApi;

    @Autowired
    ApiRetrieverService apiRetrieverService;

    @Override
    public FilmDetails getFilm(String id) {
        String url = urlApi.getDetailsURL(id);
        FilmDetails film = apiRetrieverService.detailsApiRetriever(url);
        return film;
    }
}
