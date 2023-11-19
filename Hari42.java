import java.util.Scanner;
public class KalkulatorSederhana {
    static void menu(){
        System.out.println("            KALKULATOR SEDERHANA            ");
        System.out.println("=================== MENU ===================");
        System.out.println("[1] Penjumlahan");
        System.out.println("[2] Pengurangan");
        System.out.println("[3] Perkalian");
        System.out.println("[4] Pembagian");
        System.out.println("[5] Exit");
        System.out.print("PILIH MENU > ");
        
        Scanner input =  new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("");
        switch(n){
            case 1:
                penjumlahan();
                break;
            case 2:
                pengurangan();
                break;
            case 3:
                perkalian();
                break;
            case 4:
                pembagian();
                break;
            case 5:
                System.out.println("Terima kasih telah menggunakan program ini.");
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan salah!");
        }
        System.out.println("");
    }
    
    static void penjumlahan(){
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();
        
        int penjumlahan = angka1 + angka2;
        
        System.out.println("Hasil dari "+angka1+" + "+angka2+" = "+penjumlahan);
    }
    
    static void pengurangan(){
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();
        
        int pengurangan = angka1 - angka2;
        
        System.out.println("Hasil dari "+angka1+" - "+angka2+" = "+pengurangan);
    }
    
    static void perkalian(){
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();
        
        int perkalian = angka1 * angka2;
        
        System.out.println("Hasil dari "+angka1+" x "+angka2+" = "+perkalian);
    }
    
    static void pembagian(){
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();
        
        int pembagian = angka1 / angka2;
        
        System.out.println("Hasil dari "+angka1+" / "+angka2+" = "+pembagian);
    }
    
    public static void main(String[] args) {
        do{
            menu();
        }while(true);
    }
}
