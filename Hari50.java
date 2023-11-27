public class Roket {
    public static void main(String[] args) {
        String sistem = "Berfungsi";
        int bahan_bakar = 100;
        String izin = "Diberikan";
        
        System.out.println("Status Roket");
        System.out.println("Pemeriksaan Sistem: "+sistem);
        System.out.println("Bahan Bakar: "+bahan_bakar+"%");
        System.out.println("Izin Meluncur: "+izin);
        System.out.println("");
        if (sistem == "Berfungsi" && bahan_bakar >= 100 && izin == "Diberikan") {
            System.out.println("Roket Berhasil Meluncur!");
        } else {
            System.out.println("Roket Gagal Meluncur!");
        }
    }
}
