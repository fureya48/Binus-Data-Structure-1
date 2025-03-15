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
        for (Book book : books) {
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
        for (Book book : books) {
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
            for (Book book : books) {
                System.out.println(book);
                System.out.println();
            }
        }
    }

    // soal 3.1 show available books
    public void showAvailableBooks() {
        boolean found = false;
        System.out.println("Daftar Buku yang Tersedia:");
        for (Book book : books) {
            if (book.getIsAvailable()) {
                System.out.println(book);
                System.out.println();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada buku yang tersedia saat ini.");
            System.out.println();
        }
    }

    // s
    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.getIsAvailable()) {
                    book.borrowBook();
                    System.out.println("Buku '" + title + "' berhasil dipinjam.");
                } else {
                    System.out.println("Buku '" + title + "' sedang dipinjam.");
                }
                System.out.println();
                return;
            }
        }
        System.out.println("Buku '" + title + "' tidak ditemukan.");
        System.out.println();
    }

    // soal 3.2 return book
    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (!book.getIsAvailable()) {
                    book.returnBook();
                    System.out.println("Buku '" + title + "' berhasil dikembalikan.");
                } else {
                    System.out.println("Buku '" + title + "' sudah tersedia.");
                }
                System.out.println();
                return;
            }
        }
        System.out.println("Buku '" + title + "' tidak ditemukan.");
        System.out.println();
    }
}
