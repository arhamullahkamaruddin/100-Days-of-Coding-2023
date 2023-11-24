public class Angka {
    public static void main(String[] args) {
        int angka = 40;
        System.out.println("Menampilkan angka genap dan ganjil dengan batas angka 40");
        System.out.println("");
        System.out.println("Angka Genap");
        for (int i = 0; i <= angka; i+=2) {
            int modulus = i % 2;
            if (modulus == 0) {
                System.out.print(i+" ");
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Angka Ganjil");
        for (int i = 1; i <= angka; i+=2) {
            int modulus = i % 2;
            if (modulus == 1) {
                System.out.print(i+" ");
            }
        }
        System.out.println("");
    }
}
