import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String ssnPattern = "^\\d{3}-\\d{2}-\\d{4}$";
        String ssn = SafeInput.getRegExString(in, "Enter your SSN (format: 000-00-0000)", ssnPattern);
        System.out.println("Valid SSN entered: " + ssn);


        String mNumPattern = "^(M|m)\\d{5}$";
        String mNum = SafeInput.getRegExString(in, "Enter your UC Student M number (e.g., M12345)", mNumPattern);
        System.out.println("Valid M number entered: " + mNum);


        String menuPattern = "^[OoSsVvQq]$";
        String menuChoice = SafeInput.getRegExString(in, "Enter menu choice (O=Open, S=Save, V=View, Q=Quit)", menuPattern);
        System.out.println("Valid menu choice entered: " + menuChoice.toUpperCase());
    }
}
