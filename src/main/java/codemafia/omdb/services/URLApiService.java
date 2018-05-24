package codemafia.omdb.services;

public interface URLApiService {

    String getSearchURL(String title);

    String getDetailsURL(String id);
}


