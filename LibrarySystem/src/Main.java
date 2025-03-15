import java.util.Scanner;

public class Main {
    private static  Scanner scanner;

    public static void main(String[] args) {
        // Inisialisasi objek Scanner
        scanner = new Scanner(System.in);

        User user1 = new User("Jhon Doe", "admin");
        User user2 = new User("Garry", "member");

        System.out.print("\nMasukkan nama anda: ");
        String namaPengguna = scanner.nextLine();
        System.out.print("\nMasukkan role anda: ");
        String rolePengguna = scanner.nextLine();


        if (namaPengguna.equals(user1.nama) && rolePengguna.equals(user1.role)) {
            Admin admin = new Admin(namaPengguna);
            admin.checkRole(namaPengguna, rolePengguna);

            admin.interactWithSystem();
        } else if(namaPengguna.equals(user2.nama) && rolePengguna.equals(user2.role)) {
            Member member = new Member(namaPengguna);

            member.checkRole(namaPengguna, rolePengguna);

            member.interactWithSystem();
        } else{
            System.out.println("\nNama atau role yang anda masukkan tidak sesuai.");
            scanner.close();
        }

    }
}
