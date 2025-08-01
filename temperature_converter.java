import java.util.Scanner;

public class temperature_converter {
    public static void main(String[] args){
        //temperature converter

        Scanner scanner = new Scanner(System.in);

        double temperature;
        double newTemp;
        String converter;
        System.out.print("Enter the temperature: ");
        temperature = scanner.nextDouble();
        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        converter = scanner.next().toUpperCase();

        newTemp = (converter.equals("C")) ? (temperature - 32) * 5 / 9 : (temperature * 5 / 9) + 32;

        System.out.printf("%.1f°%s",newTemp, converter);

        scanner.close();
    }
}
