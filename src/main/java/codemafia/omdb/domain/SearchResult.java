package codemafia.omdb.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchResult {
    @JsonProperty("Title")
    private String title;
    @JsonProperty("Year")
    private String year;
    @JsonProperty("imdbID")
    private String imdbID;
    @JsonProperty("Type")
    private String type;

    public SearchResult() {
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

    public String getType() {
        return type;
    }

    private SearchResult(Builder builder) {
        title = builder.title;
        year = builder.year;
        imdbID = builder.imdbID;
        type = builder.type;
    }

    public static final class Builder {
        private String title;
        private String year;
        private String imdbID;
        private String type;

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

        public Builder imdbID(String val) {
            imdbID = val;
            return this;
        }

        public Builder type(String val) {
            type = val;
            return this;
        }

        public SearchResult build() {
            return new SearchResult(this);
        }
    }

}
