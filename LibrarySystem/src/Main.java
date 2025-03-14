import java.util.Scanner;

public class Main {
    private static Scanner scanner;
    private static Library library;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        library = new Library();

        library.addBook(new Book("Java Programming", "John Doe", "B001"), true);
        library.addBook(new Book("Python Basics", "Jane Smith", "B002"), true);
        library.addBook(new Book("Data Structures", "Alice Johnson", "B003"), true);

        int choice;
        do {
            System.out.println("Pilih Menu");
            System.out.println("1. Login User");
            System.out.println("2. Login Admin");
            System.out.println("3. Keluar");
            System.out.print("Pilih Opsi (1 - 3) : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 :
                    // showMenuUser();
                    break;
                case 2 :
                    System.out.println();
                    showMenuAdmin();
                    break;
                case 3 :
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan pilih 1 - 3");
                    System.out.println();
            }
        } while (choice != 3);
        scanner.close();
    }

    private static void showMenuAdmin() {
        int choiceMenuAdmin;
        do {
            System.out.println("Pilih Menu Admin");
            System.out.println("1. Tampilkan Daftar Buku");
            System.out.println("2. Tambah Buku Baru");
            System.out.println("3. Hapus Data Buku");
            System.out.println("4. Cari Buku");
            System.out.println("5. Logout");
            System.out.print("Pilih Opsi (1 - 5) : ");
            choiceMenuAdmin = scanner.nextInt();
            scanner.nextLine();

            switch (choiceMenuAdmin) {
                case 1 :
                    library.showAllBooks();
                    break;
                case 2 :
                    System.out.print("Masukkan ID Buku (Contoh 'B001') : ");
                    String id = scanner.nextLine();
                    System.out.print("Masukkan Judul Buku : ");
                    String title = scanner.nextLine();
                    System.out.print("Masukkan Nama Penulis Buku : ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(title, author, id), false);
                    break;
                case 3 :
                    System.out.print("Masukkan Judul Buku yang ingin Dihapus : ");
                    String keyword = scanner.nextLine();
                    library.removeBook(keyword);
                    break;
                case 4 :
                    System.out.print("Masukkan Judul Buku yang ingin Dicari : ");
                    String key = scanner.nextLine();
                    library.searchBook(key);
                    break;
                case 5 :
                    System.out.println("Admin Berhasil Logout");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan pilih 1 - 3");
            }
        } while (choiceMenuAdmin != 5);
    }
}