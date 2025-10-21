import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt user for favorite integer
        int favoriteInt = SafeInput.getInt(in, "Enter your favorite integer");

        // Prompt user for favorite double
        double favoriteDouble = SafeInput.getDouble(in, "Enter your favorite double");

        System.out.println("Your favorite integer is: " + favoriteInt);
        System.out.println("Your favorite double is: " + favoriteDouble);
    }
}
