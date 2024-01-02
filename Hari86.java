import java.util.Scanner;
public class Kelembapan {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Masukkan tingkat kelembapan tanah (dalam persen): ");
        int kelembapan = input.nextInt();

        if (kelembapan < 30) {
            System.out.println("Tanah terlalu kering, tanah perlu disiram");
        } else if (kelembapan >= 30 && kelembapan <= 60) {
            System.out.println("Kelembapan tanah ideal");
        } else {
            System.out.println("Tanah terlalu basah, tanah perlu diberi drainase");
        }
    }
