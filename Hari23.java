package Ngoding100Hari;
import java.util.Scanner;
public class NilaiMahasiswa {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = input.next();
        
        System.out.print("NIM mahasiswa: ");
        String NIM = input.next();
        
        System.out.print("Jumlah mata kuliah: ");
        int n = input.nextInt();
        
        String matkul[] = new String[n];
        int nilai[] = new int[n];
        
        for (int i = 0; i < n; i++){
            System.out.println("Mata kuliah ke-"+(i+1)+":");
            System.out.print("1. Nama mata kuliah: ");
            matkul[i] = input.next();
            System.out.print("2. Nilai mata kuliah: ");
            nilai[i] = input.nextInt();
            System.out.println("");
        }
        
        System.out.println("Data yang telah diinputkan:");
        System.out.println("Nama: "+nama);
        System.out.println("NIM: "+NIM);
        System.out.println("");
        for (int i = 0; i < n; i++){
            System.out.println("Mata kuliah ke-"+(i+1)+":");
            System.out.println("Nama mata kuliah: "+matkul[i]);
            System.out.println("Nilai: "+nilai[i]);
            System.out.println("");
        }
        
    }
    
}
