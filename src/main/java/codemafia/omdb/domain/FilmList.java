package codemafia.omdb.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class FilmList {
    @JsonProperty("Search")
    private List<SearchResult> allFilms = new ArrayList<>();

    public FilmList() {
    }

    private FilmList(Builder builder) {
        allFilms = builder.allFilms;
    }

    public List<SearchResult> getAllFilms() {
        return allFilms;
    }

    public static final class Builder {
        private List<SearchResult> allFilms;

        public Builder() {
        }

        public Builder allFilms(List<SearchResult> val) {
            allFilms = val;
            return this;
        }

        public FilmList build() {
            return new FilmList(this);
        }
    }

}
