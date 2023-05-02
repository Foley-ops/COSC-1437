import java.util.Scanner;

class NotGoodLengthException extends Exception {
    public NotGoodLengthException(String message) {
        super(message);
    }
}

public class StringLengthCheck {

    public int solution(String S) throws NotGoodLengthException {
        int length = S.length();
        if (length < 10) {
            throw new NotGoodLengthException("NotGoodLengthException");
        }
        return length;
    }

    public static void main(String[] args) {
        StringLengthCheck stringLengthCheck = new StringLengthCheck();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String S = scanner.nextLine();

        try {
            int length = stringLengthCheck.solution(S);
            System.out.println("Length of the string: " + length);
        } catch (NotGoodLengthException e) {
            System.out.println(e.getMessage());
        }
    }
}
