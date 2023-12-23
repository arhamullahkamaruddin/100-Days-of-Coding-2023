import java.util.Scanner;
public class LuasLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jari2 = input.nextDouble();
        
        if (jari2 % 7 == 0) {
            double luasLingkaran = 22 / 7 * jari2 * jari2;
            System.out.println("Luas lingkaran dengan jari-jari "+jari2+" adalah: "+luasLingkaran);
        } else {
            double luasLingkaran = 3.14 * jari2 * jari2;
            System.out.println("Luas lingkaran dengan jari-jari "+jari2+" adalah: "+luasLingkaran);
        }
    }
}
