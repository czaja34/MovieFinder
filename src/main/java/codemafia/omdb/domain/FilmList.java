package codemafia.omdb.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FilmList {
    @JsonProperty("Search")
    private List<SearchResult> allFilms = new ArrayList<>();

    public FilmList() {
    }

    private FilmList(Builder builder) {
        allFilms = builder.allFilms;
    }

    public void setAllFilms(List<SearchResult> allFilms) {
        this.allFilms = allFilms;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilmList filmList = (FilmList) o;
        return Objects.equals(allFilms, filmList.allFilms);
    }

    @Override
    public int hashCode() {

        return Objects.hash(allFilms);
    }
}
