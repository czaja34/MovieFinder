package codemafia.omdb.services;

import codemafia.omdb.domain.FilmList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchServiceImp implements SearchService {

    @Autowired
    private URLApiService urlApi;

    @Autowired
    private ApiRetrieverService apiRetrieverService;

    @Override
    public FilmList getList(String title) {

        String url = urlApi.getSearchURL(title);
        FilmList foundFilms = apiRetrieverService.searchApiRetriever(url);
        return foundFilms;
    }
}
