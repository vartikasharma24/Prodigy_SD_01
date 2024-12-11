import java.util.Scanner;

class TemperatureConverter {

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Fahrenheit to Kelvin
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    // Method to convert Kelvin to Celsius
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Method to convert Kelvin to Fahrenheit
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter the unit of measurement (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        char unit = scanner.next().charAt(0);

        // Perform conversions based on the input unit
        if (unit == 'C' || unit == 'c') {
            double fahrenheit = celsiusToFahrenheit(temperature);
            double kelvin = celsiusToKelvin(temperature);
            System.out.printf("%.2f°C = %.2f°F = %.2fK\n", temperature, fahrenheit, kelvin);
        } else if (unit == 'F' || unit == 'f') {
            double celsius = fahrenheitToCelsius(temperature);
            double kelvin = fahrenheitToKelvin(temperature);
            System.out.printf("%.2f°F = %.2f°C = %.2fK\n", temperature, celsius, kelvin);
        } else if (unit == 'K' || unit == 'k') {
            double celsius = kelvinToCelsius(temperature);
            double fahrenheit = kelvinToFahrenheit(temperature);
            System.out.printf("%.2fK = %.2f°C = %.2f°F\n", temperature, celsius, fahrenheit);
        } else {
            System.out.println("Invalid unit. Please enter C, F, or K.");
        }

        scanner.close();
    }
}