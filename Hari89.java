import java.util.Scanner;
public class DayaHP {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Masukkan daya cas HP: ");
        int DayaHP = input.nextInt();
        
        if (DayaHP < 100) {
            System.out.println("Daya HP Belum Penuh");
        } else {
            System.out.println("Daya HP Penuh");
        }
    }
}
