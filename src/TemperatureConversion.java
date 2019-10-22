import java.util.Scanner;

public class TemperatureConversion {
    public static double fahrenheitToCelsius(double f) {
        double c = (5.0 / 9) * (f - 32);
        return c;
    }

    public static double celsiusToFahrenheit(double c) {
        double f = (9.0 / 5) * c + 32;
        return f;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose = -1;
        do {
            System.out.println("=========================");
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");

            System.out.print("Enter choose: ");
            choose = scanner.nextInt();

            double f;
            double c;

            switch (choose) {
                case 1:
                    System.out.print("Enter Fahrenheit: ");
                    f = scanner.nextDouble();

                    System.out.println("Celsius: " + fahrenheitToCelsius(f));
                    break;
                case 2:
                    System.out.print("Enter Celsius: ");
                    c = scanner.nextDouble();
                    System.out.println("Fahrenheit: " + celsiusToFahrenheit(c));
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choose");
            }
        }while (choose != 0);
    }
}
