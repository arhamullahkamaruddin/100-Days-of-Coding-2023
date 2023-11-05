import java.util.Scanner;
public class NilaiRataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nim;
        String nama_mahasiswa;
        int n;
        
        System.out.print("NIM: ");
        nim = input.next();
        
        System.out.print("Nama mahasiswa: ");
        nama_mahasiswa = input.next();
        
        System.out.print("Jumlah mata kuliah: ");
        n = input.nextInt();
        
        String nama_matkul[] = new String[n];
        int nilai_matkul[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Mata kuliah ke-"+(i+1)+":");
            System.out.print("Nama mata kuliah: ");
            nama_matkul[i] = input.next();
            System.out.print("Nilai: ");
            nilai_matkul[i] = input.nextInt();
        }
        
        int total_nilai = 0;
        for (int i = 0; i < n; i++) {
            total_nilai = total_nilai + nilai_matkul[i];
        }
        
        double nilai_rata2 = total_nilai / n;
        
        System.out.println("");
        System.out.println("Data Mahasiswa");
        System.out.println("NIM: "+nim);
        System.out.println("Nama Pembeli: "+nama_mahasiswa);
        System.out.println("Mata kuliah: ");
        for (int i = 0; i < n; i++) {
            System.out.println((i+1)+". Nama mata kuliah: "+nama_matkul[i]);
            System.out.println(" . Nilai: "+nilai_matkul[i]);
        }
        System.out.println("Nilai rata-rata: "+nilai_rata2);
    }
}
