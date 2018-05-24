//package codemafia.filmsForTest;
//
//import codemafia.omdb.domain.FilmList;
//import codemafia.omdb.domain.SearchResult;
//
//public class FilmForTest {
//
//    public FilmList filmList() {
//
//        FilmList filmList = new FilmList();
//
//        SearchResult searchResult1 = new SearchResult.Builder()
//                .title("Good-bye, My Lady")
//                .year("1956")
//                .imdbID("tt0049271")
//                .type("movie")
//                .build();
//
//        SearchResult searchResult2 = new SearchResult.Builder()
//                .title("Good Bye, My Secret Friend")
//                .year("2009")
//                .imdbID("tt1427236")
//                .type("movie")
//                .build();
//
//        SearchResult searchResult3 = new SearchResult.Builder()
//                .title("Good Bye, My Lover")
//                .year("1965")
//                .imdbID("tt0263313")
//                .type("movie")
//                .build();
//
//        SearchResult searchResult4 = new SearchResult.Builder()
//                .title("Good Bye My Love")
//                .year("2005")
//                .imdbID("tt3041744")
//                .type("movie")
//                .build();
//
//        filmList.getAllFilms().add(searchResult1);
//        filmList.getAllFilms().add(searchResult2);
//        filmList.getAllFilms().add(searchResult3);
//        filmList.getAllFilms().add(searchResult4);
//
//        return filmList;
//    }
//
//}
