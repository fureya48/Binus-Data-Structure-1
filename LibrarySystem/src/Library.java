import java.util.ArrayList;

class Library {
    private final ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book, Boolean init) {
        books.add(book);
        if (!init) {
            System.out.println("Buku dengan Judul '" + book.getTitle() + "' Berhasil Ditambahkan");
            System.out.println();
        }
    }

    public void removeBook(String title) {
        for (Book book: books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                books.remove(book);
                System.out.println("Buku dengan Judul '" + title + "' Berhasil Dihapus");
                System.out.println();
                return;
            }
        }
        System.out.println("Buku dengan Judul '" + title + "' Tidak Ditemukan");
        System.out.println();
    }

    public void searchBook(String title) {
        for (Book book: books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Buku dengan Judul '" + title + "' Ditemukan");
                System.out.println(book);
                System.out.println();
                return;
            }
        }
        System.out.println("Buku dengan Judul '" + title + "' Tidak Ditemukan");
        System.out.println();
    }

    public void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("Daftar Buku Kosong");
            System.out.println();
        } else {
            System.out.println("Daftar Buku");
            for (Book book: books) {
                System.out.println(book);
                System.out.println();
            }
        }
    }
}
