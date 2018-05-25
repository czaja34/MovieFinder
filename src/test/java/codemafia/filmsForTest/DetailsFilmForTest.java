package codemafia.filmsForTest;

import codemafia.omdb.domain.FilmDetails;

public class DetailsFilmForTest {

    public FilmDetails detailsFilm() {

        FilmDetails filmDetails = new FilmDetails.Builder().
                title("Good-bye, My Lady").
                year("1956").
                rated("APPROVED").
                released("12 May 1956").
                runtime("94 min").
                genre("Drama").
                director("William A. Wellman").
                writer("Albert Sidney Fleischman (screenplay), James Street (novel)").
                actors("Walter Brennan, Phil Harris, Brandon De Wilde, Sidney Poitier").
                plot("An old man and a young boy who live in the southeastern Mississippi swamps are brought together by the love of a dog.").
                language("English").
                country("USA").
                awards("N/A").
                poster("https://images-na.ssl-images-amazon.com/images/M/MV5BMTc3NzA5MzM3MF5BMl5BanBnXkFtZTcwNjgwMTcxMQ@@._V1_SX300.jpg").
                imdbID("tt0049271").build();
        return filmDetails;
    }

}
