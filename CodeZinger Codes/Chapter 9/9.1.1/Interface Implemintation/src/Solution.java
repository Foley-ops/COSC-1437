import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentSpeed = scanner.nextInt();
        scanner.nextLine();

        Suzuki suzuki = new Suzuki(currentSpeed);

        int speed = scanner.nextInt();
        suzuki.increaseSpeed(speed);

        suzuki.displaySpeed();
    }
}
