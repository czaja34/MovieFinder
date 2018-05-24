package codemafia.omdb.services;

import codemafia.omdb.domain.FilmDetails;
import codemafia.omdb.domain.FilmList;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiRetrieverServiceImpl implements ApiRetrieverService {
    @Override
    public FilmList searchApiRetriever(String url) {
        RestTemplate template = new RestTemplate();
        FilmList filmList = template.getForObject(url, FilmList.class);
        return filmList;
    }

    @Override
    public FilmDetails detailsApiRetriever(String url) {
        RestTemplate template = new RestTemplate();
        FilmDetails filmDetails = template.getForObject(url, FilmDetails.class);
        return filmDetails;
    }
}
