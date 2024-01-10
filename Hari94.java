import java.util.Scanner;
public class ToUppercase {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Inputkan Data Di Bawah Ini!");
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        System.out.print("Masukkan jenis kelamin: ");
        String jk = input.nextLine();
        System.out.print("Masukkan kelas: ");
        String kelas = input.nextLine();
        System.out.print("Masukkan angkatan: ");
        int angkatan = input.nextInt();

        System.out.println("\nData Mahasiswa: ");
        System.out.println("Nama Mahasiswa: "+nama.toUpperCase());
        System.out.println("NIM: "+nim.toUpperCase());
        System.out.println("Jenis Kelamin: "+jk.toUpperCase());
        System.out.println("Kelas: "+kelas.toUpperCase());
        System.out.println("Angkatan: "+angkatan);
    }
}
