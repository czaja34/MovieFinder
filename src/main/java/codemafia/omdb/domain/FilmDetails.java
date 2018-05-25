package codemafia.omdb.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class FilmDetails {
    @JsonProperty("Title")
    private String title;
    @JsonProperty("Year")
    private String year;
    @JsonProperty("Rated")
    private String rated;
    @JsonProperty("Released")
    private String released;
    @JsonProperty("Runtime")
    private String runtime;
    @JsonProperty("Genre")
    private String genre;
    @JsonProperty("Director")
    private String director;
    @JsonProperty("Writer")
    private String writer;
    @JsonProperty("Actors")
    private String actors;
    @JsonProperty("Plot")
    private String plot;
    @JsonProperty("Language")
    private String language;
    @JsonProperty("Country")
    private String country;
    @JsonProperty("Awards")
    private String awards;
    @JsonProperty("Poster")
    private String poster;
    @JsonProperty("imdbID")
    private String imdbID;

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public String getRated() {
        return rated;
    }

    public String getReleased() {
        return released;
    }

    public String getRuntime() {
        return runtime;
    }

    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }

    public String getWriter() {
        return writer;
    }

    public String getActors() {
        return actors;
    }

    public String getPlot() {
        return plot;
    }

    public String getLanguage() {
        return language;
    }

    public String getCountry() {
        return country;
    }

    public String getAwards() {
        return awards;
    }

    public String getPoster() {
        return poster;
    }

    public String getImdbID() {
        return imdbID;
    }

    public FilmDetails() {
    }

    private FilmDetails(Builder builder) {
        title = builder.title;
        year = builder.year;
        rated = builder.rated;
        released = builder.released;
        runtime = builder.runtime;
        genre = builder.genre;
        director = builder.director;
        writer = builder.writer;
        actors = builder.actors;
        plot = builder.plot;
        language = builder.language;
        country = builder.country;
        awards = builder.awards;
        poster = builder.poster;
        imdbID = builder.imdbID;
    }

    public static final class Builder {
        private String title;
        private String year;
        private String rated;
        private String released;
        private String runtime;
        private String genre;
        private String director;
        private String writer;
        private String actors;
        private String plot;
        private String language;
        private String country;
        private String awards;
        private String poster;
        private String imdbID;

        public Builder() {
        }

        public Builder title(String val) {
            title = val;
            return this;
        }

        public Builder year(String val) {
            year = val;
            return this;
        }

        public Builder rated(String val) {
            rated = val;
            return this;
        }

        public Builder released(String val) {
            released = val;
            return this;
        }

        public Builder runtime(String val) {
            runtime = val;
            return this;
        }

        public Builder genre(String val) {
            genre = val;
            return this;
        }

        public Builder director(String val) {
            director = val;
            return this;
        }

        public Builder writer(String val) {
            writer = val;
            return this;
        }

        public Builder actors(String val) {
            actors = val;
            return this;
        }

        public Builder plot(String val) {
            plot = val;
            return this;
        }

        public Builder language(String val) {
            language = val;
            return this;
        }

        public Builder country(String val) {
            country = val;
            return this;
        }

        public Builder awards(String val) {
            awards = val;
            return this;
        }

        public Builder poster(String val) {
            poster = val;
            return this;
        }

        public Builder imdbID(String val) {
            imdbID = val;
            return this;
        }

        public FilmDetails build() {
            return new FilmDetails(this);
        }
    }

    @Override
    public String toString() {
        return
                "title: " + title + '\n' +
                        " \nyear: " + year + '\n' +
                        " \nrated: " + rated + '\n' +
                        " \nreleased: " + released + '\n' +
                        " \nruntime: " + runtime + '\n' +
                        " \ngenre: " + genre + '\n' +
                        " \ndirector: " + director + '\n' +
                        " \nwriter: " + writer + '\n' +
                        " \nactors: " + actors + '\n' +
                        " \nplot: " + plot + '\n' +
                        " \nlanguage: " + language + '\n' +
                        " \ncountry: " + country + '\n' +
                        " \nawards: " + awards + '\n' +
                        " \nposter: " + poster;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilmDetails that = (FilmDetails) o;
        return Objects.equals(title, that.title) &&
                Objects.equals(year, that.year) &&
                Objects.equals(rated, that.rated) &&
                Objects.equals(released, that.released) &&
                Objects.equals(runtime, that.runtime) &&
                Objects.equals(genre, that.genre) &&
                Objects.equals(director, that.director) &&
                Objects.equals(writer, that.writer) &&
                Objects.equals(actors, that.actors) &&
                Objects.equals(plot, that.plot) &&
                Objects.equals(language, that.language) &&
                Objects.equals(country, that.country) &&
                Objects.equals(awards, that.awards) &&
                Objects.equals(poster, that.poster) &&
                Objects.equals(imdbID, that.imdbID);
    }

    @Override
    public int hashCode() {

        return Objects.hash(title, year, rated, released, runtime, genre, director, writer, actors, plot, language, country, awards, poster, imdbID);
    }
}
