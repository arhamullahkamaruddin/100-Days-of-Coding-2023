import java.util.Scanner;
public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = input.nextLine();
        
        System.out.print("Masukkan jumlah matakuliah: ");
        int n = input.nextInt();
        
        String nama_matkul[] = new String[n];
        double nilai[] = new double[n];
        double nilai1[] = new double[n];
        double nilai2[] = new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nMatakuliah ke: "+(i+1));
            System.out.print("Masukkan nama matakuliah: ");
            nama_matkul[i] = input.next();
            System.out.print("Masukkan nilai dosen ke-1: ");
            nilai1[i] = input.nextInt();
            System.out.print("Masukkan nilai dosen ke-2: ");
            nilai2[i] = input.nextInt();
        }
        
        System.out.println("\n=== Nilai ===");
        System.out.println("Nama mahasiswa: "+nama.toUpperCase());
        System.out.println("NIM mahasiswa: "+nim.toUpperCase());
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nNama matakuliah ke-"+(i+1)+": "+nama_matkul[i].toUpperCase());
            nilai[i] = (nilai1[i]+nilai2[i])/2;
            System.out.println("Nilai: "+nilai[i]);
            if (nilai[i] > 85) {
                System.out.println("Grade: A");
            } else if (nilai[i] > 80) {
                System.out.println("Grade: A-");
            } else if (nilai[i] > 75) {
                System.out.println("Grade: B+");
            } else if (nilai[i] > 70) {
                System.out.println("Grade: B");
            } else if (nilai[i] > 65) {
                System.out.println("Grade: B-");
            } else if (nilai[i]  > 80) {
                System.out.println("Grade: A-");
            } else if (nilai[i]  > 60) {
                System.out.println("Grade: C+");
            } else if (nilai[i]  > 55) {
                System.out.println("Grade: C");
            } else if (nilai[i]  > 50) {
                System.out.println("Grade: C-");
            } else if (nilai[i]  > 40) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: E");
            }
        }
        
        double nilai_awal = 0;
        for (int i = 0; i < n; i++) {
            nilai_awal += nilai[i];
        }
        
        double rata2 = nilai_awal/2;
        System.out.println("\nNilai rata-rata: "+rata2);
        if (rata2 > 85) {
            System.out.println("Grade: A");
        } else if (rata2 > 80) {
            System.out.println("Grade: A-");
        } else if (rata2 > 75) {
            System.out.println("Grade: B+");
        } else if (rata2 > 70) {
            System.out.println("Grade: B");
        } else if (rata2 > 65) {
            System.out.println("Grade: B-");
        } else if (rata2  > 80) {
            System.out.println("Grade: A-");
        } else if (rata2  > 60) {
            System.out.println("Grade: C+");
        } else if (rata2  > 55) {
            System.out.println("Grade: C");
        } else if (rata2  > 50) {
            System.out.println("Grade: C-");
        } else if (rata2  > 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: E");
        }
    }
}
