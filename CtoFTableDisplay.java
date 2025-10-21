public class CtoFTableDisplay {

    public static void main(String[] args) {
        System.out.printf("%10s %15s\n", "Celsius", "Fahrenheit");
        System.out.println("----------------------------------");

        // Loop from -100 to 100 degrees Celsius
        for (int c = -100; c <= 100; c++) {
            double f = CtoF(c);
            System.out.printf("%10d %15.2f\n", c, f);
        }
    }

    // Converts Celsius to Fahrenheit
    public static double CtoF(double Celsius) {
        return (Celsius * 9.0 / 5.0) + 32.0;
    }
}
