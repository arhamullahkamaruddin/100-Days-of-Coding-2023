import java.util.Scanner;
public class login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String username = input.nextLine();
        
        System.out.print("Masukkan password: ");
        String password = input.nextLine();
        
        if (username.equals("admin") && password.equals("admin123")) {
            System.out.println("\nLogin berhasil!");
        } else {
            System.out.println("\nPassword atau username salah!");

            System.out.print("\nMasukkan username: ");
            username = input.nextLine();

            System.out.print("Masukkan password: ");
            password = input.nextLine();

            if (username.equals("admin") && password.equals("admin123")) {
                System.out.println("\nLogin berhasil!");
            } else {
                System.out.println("\nPassword atau username salah!");
                
                System.out.print("\nMasukkan username: ");
                username = input.nextLine();

                System.out.print("Masukkan password: ");
                password = input.nextLine();

                if (username.equals("admin") && password.equals("admin123")) {
                    System.out.println("\nLogin berhasil!");
                } else {
                    System.out.println("\nBatas pengisian login terpenuhi!");
                    System.out.println("Login Gagal");
                }
            }
        }
    }
}
