public class Book {
    private final String title;
    private final String author;
    private final String id;
    private boolean isAvailable; // soal nomor 3 menambahkan variabel isAvailable (3.1)

    public Book(String title, String author, String id) {
        this.title = title;
        this.author = author;
        this.id = id;
        this.isAvailable = true; // constructor variabel isAvailable (3.1)
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

    public boolean getIsAvailable() { // getter variabel isAvailable (3.1)
        return isAvailable;
    }

    public void borrowBook() { // method borrowBook (3.2)
        this.isAvailable = false;
    }

    public void returnBook() { // method returnBook (3.2)
        isAvailable = true;
    }

    @Override
    public String toString() {
        return "ID Buku :  " + id + "\nJudul : " + title + "\nPenulis : " + author;
    }
}
