import java.util.Scanner;

public class Admin extends User{
    private Library library;

    public Admin(String nama){
        super(nama, "admin");
    }

    @Override
    public void checkRole(String nama, String role) {
        System.out.println("\nUser dengan nama " + nama + " berhasil login");
    }

    @Override
    public void interactWithSystem() {
        scanner = new Scanner(System.in);
        library = new Library();

        // Menambahkan buku ke library
        library.addBook(new Book("Java Programming", "John Doe", "B001"), true);
        library.addBook(new Book("Python Basics", "Jane Smith", "B002"), true);
        library.addBook(new Book("Data Structures", "Alice Johnson", "B003"), true);

        int choiceMenuAdmin;
        do {
            System.out.println("\nPilih Menu Admin");
            System.out.println("1. Tampilkan Daftar Buku");
            System.out.println("2. Tambah Buku Baru");
            System.out.println("3. Hapus Data Buku");
            System.out.println("4. Cari Buku");
            System.out.println("5. Logout");
            System.out.print("\nPilih Opsi (1 - 5) : ");
            choiceMenuAdmin = scanner.nextInt();
            scanner.nextLine();

            switch (choiceMenuAdmin) {
                case 1 -> library.showAllBooks();
                case 2 -> {
                    System.out.print("Masukkan ID Buku (Contoh 'B001') : ");
                    String id = scanner.nextLine();
                    System.out.print("Masukkan Judul Buku : ");
                    String title = scanner.nextLine();
                    System.out.print("Masukkan Nama Penulis Buku : ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(title, author, id), false);
                }
                case 3 -> {
                    System.out.print("\nMasukkan Judul Buku yang ingin Dihapus : ");
                    String keyword = scanner.nextLine();
                    library.removeBook(keyword);
                }
                case 4 -> {
                    System.out.print("\nMasukkan Judul Buku yang ingin Dicari : ");
                    String key = scanner.nextLine();
                    library.searchBook(key);
                }
                case 5 -> System.out.println(nama + " Berhasil Logout");
                default -> System.out.println("Pilihan tidak valid. Silahkan pilih 1 - 3");
            }
        } while (choiceMenuAdmin != 5);
    }
}
