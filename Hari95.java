import java.util.Scanner;
public class KgKePound {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan berat dalam kilogram: ");
        double berat_kg = input.nextDouble();

        double berat_pound = berat_kg * 2.20462;

        System.out.println("Berat dalam kilogram: "+berat_kg);
        System.out.println("Berat dalam pound: "+berat_pound);
    }
}
