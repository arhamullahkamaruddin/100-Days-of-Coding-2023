package Ngoding100Hari;
import java.util.Scanner;
public class DataMahasiswa {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Selamat Datang di Program Input Data Mahasiswa");
        System.out.println("");
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = input.nextInt();
        
        String nama[] = new String[n];
        String nim[] = new String[n];
        int nilai[] = new int[n];
        
        for (int i = 0; i < n; i++){
            System.out.println("Data Mahasiswa ke-"+(i+1));
            System.out.print("Masukkan nama mahasiswa: ");
            nama[i] = input.next();
            System.out.print("Masukkan NIM mahasiswa: ");
            nim[i] = input.next();
            System.out.print("Masukkan nilai mahasiswa: ");
            nilai[i] = input.nextInt();
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("Data Mahasiswa: ");
        for (int i = 0; i < n; i++){
            System.out.println((i+1)+". Nama: "+nama[i]);
            System.out.println("   NIM: "+nim[i]);
            if (nilai[i] >= 90) {
                System.out.println("   Nilai: "+nilai[i]);
                System.out.println("   Grade: A");
            } else if (nilai[i] >= 80) {
                System.out.println("   Nilai: "+nilai[i]);
                System.out.println("   Grade: B");
            } else if (nilai[i] >= 70) {
                System.out.println("   Nilai: "+nilai[i]);
                System.out.println("   Grade: C");
            } else if (nilai[i] >= 60) {
                System.out.println("   Nilai: "+nilai[i]);
                System.out.println("   Grade: D");
            } else {
                System.out.println("   Nilai: "+nilai[i]);
                System.out.println("   Grade: E");
            }
            
            if (nilai[i] >= 60) {
                System.out.println("   Ket: Lulus");
            } else {
                System.out.println("   Ket: Gagal");
            }
            System.out.println("");
        }
    }
    
}
