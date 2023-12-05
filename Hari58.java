public class PeluncuranRoket {
    public static void main(String[] args) {
        String sistem = "Berfungsi";
        int bahan_bakar = 100;
        String izin = "Diberikan";
        
        if (sistem == "Berfungsi" && bahan_bakar >= 80 && izin == "Diberikan") {
            System.out.println("Status Roket");
            System.out.println("Pemeriksaan sistem: "+sistem);
            System.out.println("Bahan Bakar: "+bahan_bakar+"%");
            System.out.println("Izin: "+izin);
            System.out.println("");
            System.out.println("Roket Meluncur!");
        } else {
            System.out.println("Roket Gagal Meluncur!");
        }
    }
}
