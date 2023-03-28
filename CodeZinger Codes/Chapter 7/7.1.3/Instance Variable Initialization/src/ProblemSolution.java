import java.util.Scanner;

public class ProblemSolution {
    private static String name;
    private static String designation;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        name = scanner.nextLine();
        designation = scanner.nextLine();

        solution();

    }
    public static void solution() {
        System.out.println(name);
        System.out.println(designation);

    }
}