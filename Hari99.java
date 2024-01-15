import java.util.Scanner;
public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = input.nextLine();
        
        System.out.print("Masukkan matakuliah: ");
        String matkul = input.nextLine();
        
        System.out.print("Masukkan nilai dosen pertama: ");
        double nilai1 = input.nextDouble();
        
        System.out.print("Masukkan nilai dosen kedua: ");
        double nilai2 = input.nextDouble();
        
        double nilai_akhir = (nilai1 + nilai2) / 2;
        
        System.out.println("\n=== Nilai ===");
        System.out.println("Nama mahasiswa: "+nama);
        System.out.println("NIM mahasiswa: "+nim);
        System.out.println("Matakuliah: "+matkul);
        System.out.println("Nilai akhir: "+nilai_akhir);
        if (nilai_akhir > 85) {
            System.out.println("Grade: A");
        } else if (nilai_akhir > 80) {
            System.out.println("Grade: A-");
        } else if (nilai_akhir > 75) {
            System.out.println("Grade: B+");
        } else if (nilai_akhir > 70) {
            System.out.println("Grade: B");
        } else if (nilai_akhir > 65) {
            System.out.println("Grade: B-");
        } else if (nilai_akhir > 80) {
            System.out.println("Grade: A-");
        } else if (nilai_akhir > 60) {
            System.out.println("Grade: C+");
        } else if (nilai_akhir > 55) {
            System.out.println("Grade: C");
        } else if (nilai_akhir > 50) {
            System.out.println("Grade: C-");
        } else if (nilai_akhir > 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: E");
        }
    }
}
