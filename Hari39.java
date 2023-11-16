package Ngoding100Hari;
import java.util.Scanner;
public class login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan username: ");
        String username = input.next();
        
        System.out.print("Masukkan password: ");
        String password = input.next();

        System.out.println("");
        if (username.equals("admin") && password.equals("admin123")) {
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Login gagal!");
        }
    }
}
