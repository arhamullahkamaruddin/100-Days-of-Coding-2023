import java.util.Scanner;
public class AbsenKelas {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Selamat Datang di Program List Nama Mahasiswa");
        System.out.print("Masukkan nama fakultas: ");
        String fakultas = input.next();
        System.out.print("Masukkan nama program studi: ");
        String prodi = input.next();
        System.out.print("Masukkan nama kelas: ");
        String kelas = input.next();
        System.out.print("Masukkan angkatan: ");
        String angkatan = input.next();
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        
        String nama[] = new String[jumlah];
        String nim[] = new String[jumlah];
        System.out.println("");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mahasiswa ke-"+(i+1));
            System.out.print("Nama: ");
            nama[i] = input.next();
            
            System.out.print("NIM: ");
            nim[i] = input.next();
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println(fakultas+" "+prodi+" "+kelas+" "+angkatan);
        System.out.println("================================");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i+1)+". "+nama[i]+" ("+nim[i]+")");
        }
        System.out.println("================================");
    }
}
