import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dataType = s.nextInt();
        ProblemSolution problemSolution = new ProblemSolution();
        switch (dataType) {
            case 1: // Integer
                int num1 = s.nextInt();
                int num2 = s.nextInt();
                System.out.println(problemSolution.solution(num1, num2));
                break;
            case 2: // Float
                float num1f = s.nextFloat();
                float num2f = s.nextFloat();
                System.out.println(problemSolution.solution(num1f, num2f));
                break;
            case 3: // Character
                char num1c = s.next().charAt(0);
                char num2c = s.next().charAt(0);
                System.out.println(problemSolution.solution(num1c, num2c));
                break;
            default:
                System.out.println("Invalid data type.");
                break;
        }
    }
}