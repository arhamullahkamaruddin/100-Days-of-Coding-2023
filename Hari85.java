public class SuhuTubuh {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Masukkan suhu (derajat celsius): ");
        double suhu = input.nextDouble();

        if (suhu > 37.2) {
            System.out.println("Suhu tubuh panas");
        } else {
            System.out.println("Suhu tubuh tidak panas");
        }
    }
}
