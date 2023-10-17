public class Latihan_Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Pilih angka 1 sampai 5: ");
        int angka = input.nextInt();
        switch (angka) {
            case 1:
                System.out.println("Angka yang dipilih adalah satu");
                break;
            case 2:
                System.out.println("Angka yang dipilih adalah dua");
                break;
            case 3:
                System.out.println("Angka yang dipilih adalah tiga");
                break;
            case 4:
                System.out.println("Angka yang dipilih adalah empat");
                break;
            case 5:
                System.out.println("Angka yang dipilih adalah lima");
                break;
            default:
                System.out.println("Angka tidak dikenali");
        }
    }
}
