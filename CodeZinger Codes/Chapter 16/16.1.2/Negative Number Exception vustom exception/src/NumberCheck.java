import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class NumberCheck {

    public int solution(int N) throws NegativeNumberException {
        if (N < 0) {
            throw new NegativeNumberException("NegativeNumberException");
        } else if (N == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        NumberCheck numberCheck = new NumberCheck();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        try {
            int result = numberCheck.solution(N);
            System.out.println(result);
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
