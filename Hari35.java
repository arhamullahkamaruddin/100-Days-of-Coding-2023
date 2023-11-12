import java.util.Scanner;
public class MenghitungKecepatan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menghitung kecepatan");
        System.out.print("Masukkan jarak dalam meter: ");
        int jarak = input.nextInt();

        System.out.print("Masukkan waktu dalam detik: ");
        int waktu = input.nextInt();
        
        int kecepatan = jarak / waktu;
        
        System.out.println("Kecepatan adalah: "+kecepatan+" m/s");
    }
}
