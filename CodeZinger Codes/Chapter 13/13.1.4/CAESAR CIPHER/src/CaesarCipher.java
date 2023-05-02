import java.util.Scanner;

public class CaesarCipher {

    public static String encrypt(String s, int k) {
        StringBuilder encrypted = new StringBuilder();

        // Ensure the shift value is between 0 and 25
        k = k % 26;

        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                encrypted.append((char) ((c - 'a' + k) % 26 + 'a'));
            } else if (Character.isUpperCase(c)) {
                encrypted.append((char) ((c - 'A' + k) % 26 + 'A'));
            } else {
                // Leave numbers and special characters unencrypted
                encrypted.append(c);
            }
        }

        return encrypted.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the unencrypted string: ");
        String s = scanner.nextLine();

        System.out.print("Enter the shift number: ");
        int k = scanner.nextInt();

        String encrypted = encrypt(s, k);
        System.out.println("Encrypted string: " + encrypted);
    }
}
