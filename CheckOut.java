import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0.0;

        System.out.println("Welcome to the $10 Store!");

        do {
            // Input price of an item within range 0.50 to 10.00
            double price = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 10.00);
            total += price;

        } while (SafeInput.getYNConfirm(in, "Do you have more items to enter"));

        System.out.printf("Total cost of your items is: $%.2f\n", total);
    }
}
