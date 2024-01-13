import java.util.Scanner;
public class FahrenheitKeCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan suhu dalam derajat fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsius = (fahrenheit - 32) * 5/9;

        System.out.println(fahrenheit+" derajat fahrenheit sama dengan "+celsius+" derajat celcius");
    }
}
