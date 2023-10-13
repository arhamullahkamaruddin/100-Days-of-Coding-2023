import java.util.Scanner;
public class Hari2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama: ");
        String nama = input.next();
        
        System.out.print("Masukkan NIM: ");
        String nim = input.next();
        
        System.out.print("Masukkan kelas: ");
        String kelas = input.next();
        
        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();
        
        System.out.print("Masukkan alamat: ");
        String alamat = input.next();
        
        System.out.println("");
        System.out.println("Data yang diinputkan: ");
        System.out.println("Nama    : "+nama);
        System.out.println("NIM     : "+nim);
        System.out.println("Kelas   : "+kelas);
        System.out.println("Umur    : "+umur);
        System.out.println("Alamat  : "+alamat);
    }
}
