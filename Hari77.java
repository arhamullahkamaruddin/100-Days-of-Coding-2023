import java.util.Scanner;
public class GajiBersih {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan gaji pokok: ");
        int gaji_pokok = input.nextInt();

        System.out.print("Masukkan jam lembur: ");
        int jam_lembur = input.nextInt();
        
        int gaji_lembur = jam_lembur * 55000;
        
        int gaji_bersih = gaji_pokok + gaji_lembur;
        
        System.out.println("Gaji bersih adalah: Rp."+gaji_bersih);
    }
}
