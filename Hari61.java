import java.util.Scanner;
public class MembuangSampah {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Menu Kategori Sampah");
        System.out.println("[1] Sampah organik");
        System.out.println("[2] Sampah yang dapat digunakan kembali");
        System.out.println("[3] Sampah yang dapat didaur ulang");
        System.out.println("[4] Sampah yang tidak dapat diolah");
        System.out.print("PILIH MENU > ");
        int menu = input.nextInt();
        System.out.println("");
        if (menu == 1) {
            System.out.println("Sampah diolah menjadi pupuk");
        } else if (menu == 2) {
            System.out.println("Sampah dimanfaatkan untuk hal lain");
        } else if (menu == 3) {
            System.out.println("Sampah didaur ulang menjadi barang lain");
        } else if (menu == 4) {
            System.out.println("Sampah dibuang ke tempat pembuangan akhir");
        } else {
            System.out.println("Masukkan menu sesuai angka yang tersedia!");
        }
    }
}
