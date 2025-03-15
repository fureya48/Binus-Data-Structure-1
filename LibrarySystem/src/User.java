import java.util.Scanner;

public class User {
    protected String nama;
    protected String role;
    protected Scanner scanner;

    public User(String nama, String role) {
        this.nama = nama;
        this.role = role;
        this.scanner = new Scanner(System.in);
    }

    public void checkRole(String nama, String role) {
        System.out.println("User dengan nama : " + nama + " adalah " + role);
    }

    public void interactWithSystem(){
        
    };
}
