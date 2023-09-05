import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {

        System.out.print("Enter the length of the password: ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        System.out.print("Special characters? (yes/no): ");
        sc.nextLine();
        String specialChar = sc.nextLine().toLowerCase();
        String password = generatePassword(length, specialChar.equals("yes"));
        System.out.println("Generated Password: " + password);
    }

    public static String generatePassword(int length, boolean specialChar) {
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialChars = "!@#$%^&*()-_+=<>?";
        String allChars = uppercase + lowercase + digits;
        if (specialChar) {
            allChars += specialChars;
        }
        SecureRandom entropyRandom = new SecureRandom();
        StringBuilder password = new StringBuilder(length);
        int i = 0;
        while (i < length) {
            int randomIndex = entropyRandom.nextInt(allChars.length());
            password.append(allChars.charAt(randomIndex));
            i++;
        }
        return password.toString();
    }
}
