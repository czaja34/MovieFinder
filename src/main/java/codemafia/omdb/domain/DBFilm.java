package codemafia.omdb.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class  DBFilm {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String year;
    private String imdbID;

    public DBFilm() {
    }

    private DBFilm(Builder builder) {
        id = builder.id;
        title = builder.title;
        year = builder.year;
        imdbID = builder.imdbID;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public String getImdbID() {
        return imdbID;
    }

    public static final class Builder {
        private Long id;
        private String title;
        private String year;
        private String imdbID;

        public Builder() {
        }

        public Builder id(Long val) {
            id = val;
            return this;
        }

        public Builder title(String val) {
            title = val;
            return this;
        }

        public Builder year(String val) {
            year = val;
            return this;
        }

        public Builder imdbID(String val) {
            imdbID = val;
            return this;
        }

        public DBFilm build() {
            return new DBFilm(this);
        }
    }
}
