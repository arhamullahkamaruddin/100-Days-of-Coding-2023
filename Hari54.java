import java.util.Scanner;
public class BBIdeal {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Program menghitung berat badan ideal");
        System.out.print("Masukkan tinggi badan (dalam cm): ");
        double tinggi_badan = input.nextDouble();
        double berat_badan = (tinggi_badan - 100) - ((tinggi_badan - 100) * (10 / 100));
        System.out.println("Berat badan ideal untuk tinggi badan "+tinggi_badan+"cm adalah "+berat_badan+"kg");
    }
}
