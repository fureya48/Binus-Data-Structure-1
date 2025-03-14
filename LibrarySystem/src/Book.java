public class Book {
    private final String title;
    private final String author;
    private final String id;

    public Book(String title, String author, String id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID Buku :  " + id + "\nJudul : " + title + "\nPenulis : " + author;
    }
}
