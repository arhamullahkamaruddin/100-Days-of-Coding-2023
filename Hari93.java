import java.util.Scanner;
public class Penyimpanan {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Masukkan jumlah penyimpanan yang terpakai: ");
        int penyimpanan = input.nextInt();
        
        if (penyimpanan >= 71) {
            System.out.println("Penyimpanan di atas 70% harap bersihkan penyimpanan");
        } else {
            System.out.println("Penyimpanan di bawah 71%");
        }
    }
}
