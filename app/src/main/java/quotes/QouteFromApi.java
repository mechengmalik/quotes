package quotes;

public class QouteFromApi {
    private String text;
    private String author;
    private String name;
    private String likes;



    public QouteFromApi(String text, String author, String name, String likes) {
        this.text = text;
        this.author = author;
        this.name = name;
        this.likes= likes;


    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "QuoteFromApi{" +
                "text='" + text + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
