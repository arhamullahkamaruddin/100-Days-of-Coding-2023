import java.util.Scanner;
public class RumusGaya {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat Datang di Program Menghitung Gaya");

        System.out.print("\nMasukkan massa benda (kg): ");
        double massa = input.nextDouble();

        System.out.print("Masukkan percepatan benda (m/s^2): ");
        double percepatan = input.nextDouble();

        double gaya = massa * percepatan;
        
        System.out.println("\nHasil Perhitungan");
        System.out.println("Massa benda: "+massa+" kg");
        System.out.println("Percepatan benda: "+percepatan+" m/s^2");
        System.out.println("Gaya yang diterapkan: "+gaya+" Newton");
    }
}
