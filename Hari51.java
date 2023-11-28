import java.util.Scanner;
public class Rata2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan angka puluhan: ");
        int puluhan = input.nextInt();
        
        System.out.print("Masukkan angka ratusan: ");
        int ratusan = input.nextInt();
        
        System.out.print("Masukkan angka ribuan : ");
        int ribuan = input.nextInt();
        
        double rata2 = (puluhan + ratusan + ribuan) / 3;
        
        System.out.println("Rata-rata: "+rata2);
    }
}
