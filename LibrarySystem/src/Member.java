import java.util.Scanner;

public class Member extends User {
    private  Library library;

    public Member(String nama){
        super(nama, "member");
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

        int choiceMenuMember;
        do {
            System.out.println("\nPilih Menu User");
            System.out.println("1. Lihat Buku yang Tersedia");
            System.out.println("2. Pinjam Buku");
            System.out.println("3. Kembalikan Buku");
            System.out.println("4. Logout");
            System.out.print("\nPilih Opsi (1 - 4) : ");
            choiceMenuMember = scanner.nextInt();
            scanner.nextLine();

            switch (choiceMenuMember) {
                case 1 -> library.showAvailableBooks();
                case 2 -> {
                    System.out.print("\nMasukkan Judul Buku yang ingin Dipinjam: ");
                    String borrowTitle = scanner.nextLine();
                    library.borrowBook(borrowTitle);
                }
                case 3 -> {
                    System.out.print("\nMasukkan Judul Buku yang ingin Dikembalikan: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                }
                case 4 -> System.out.println(nama + " Berhasil Logout");
                default -> System.out.println("Pilihan tidak valid. Silahkan pilih 1 - 4");
            }
        } while (choiceMenuMember != 4);
    }
}
