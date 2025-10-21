import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Year input
        int year = SafeInput.getRangedInt(in, "Enter birth year", 1950, 2015);

        // Month input
        int month = SafeInput.getRangedInt(in, "Enter birth month", 1, 12);

        // Determine max days based on month group
        int maxDays;

        switch (month) {
            case 2:
                // February (1-29)
                maxDays = 29;
                break;

            // Months with 30 days
            case 4: case 6: case 9: case 11:
                maxDays = 30;
                break;

            // Months with 31 days
            default:
                maxDays = 31;
                break;
        }

        // Day input with correct maxDays
        int day = SafeInput.getRangedInt(in, "Enter birth day", 1, maxDays);

        // Hours input 1-24
        int hour = SafeInput.getRangedInt(in, "Enter birth hour (1-24)", 1, 24);

        // Minutes input 1-59
        int minute = SafeInput.getRangedInt(in, "Enter birth minute (1-59)", 1, 59);

        // Display the collected birth date/time
        System.out.printf("Date of Birth: %04d-%02d-%02d %02d:%02d\n",
                year, month, day, hour, minute);
    }
}
