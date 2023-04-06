import java.util.Scanner;

abstract class Car {
    private String model;
    private int maxSpeed;
    public Car(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
    protected String getModelValue() {
        return model;
    }
    protected int getMaxSpeedValue() {
        return maxSpeed;
    }

    abstract String getModel();
    abstract int getMaxSpeed();
}
class Suzuki extends Car {
    public Suzuki(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    String getModel() {
        return getModelValue();
    }

    @Override
    int getMaxSpeed() {
        return getMaxSpeedValue();
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String model = s.nextLine();
        int maxSpeed = s.nextInt();
        s.nextLine();

        Suzuki suzuki = new Suzuki(model, maxSpeed);
        System.out.println(suzuki.getModel());
        System.out.println(suzuki .getMaxSpeed());

    }
}