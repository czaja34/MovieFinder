package codemafia.omdb.domain;

public class SearchInstance {
    private String title;
    private String id;

    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(String id) {
        this.id = id;
    }

    private static SearchInstance searchInstance = new SearchInstance();

    public static SearchInstance getInstance() {
        return searchInstance;
    }

    private SearchInstance() {
    }

}
