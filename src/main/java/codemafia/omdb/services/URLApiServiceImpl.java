package codemafia.omdb.services;

import org.springframework.stereotype.Service;

@Service
public class URLApiServiceImpl implements URLApiService {

    @Override
    public String getSearchURL(String title) {
        String link = "http://www.omdbapi.com/?apikey=588de52d&s=";
        link += title;
        return link;
    }

    @Override
    public String getDetailsURL(String id) {
        String link = "http://www.omdbapi.com/?apikey=588de52d&i=";
        link += id;
        return link;
    }
}
