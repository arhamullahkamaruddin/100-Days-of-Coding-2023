public class Fungsi {
    void penjumlahan(){
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();
        
        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();
        
        int hasil = angka1 + angka2;
        
        System.out.println("Hasil dari "+angka1+" + "+angka2+" = "+hasil);
    }
    
    public static void main(String[] args) {
        Fungsi objek = new Fungsi();
        objek.penjumlahan();
    }
}
