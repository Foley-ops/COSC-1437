import java.util.Scanner;

class Car {
    String color;
    String model;

    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    String getColor()
    {
        return color;
    }

    String getModel()
    {
        return model;
    }
}

public class Solution {
    static void display(Car car,int wheels){
        System.out.println(car.getModel() + " " + car.getColor() + " " + wheels);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line;
        String model;
        String color;
        int wheels;

        line = in.nextLine();
        String[] tokens = line.split(" ");

        model = tokens[0];
        color = tokens[1];
        wheels = Integer.parseInt(tokens[2]);
        BMW bmw = new BMW(model, color, wheels);

        line = in.nextLine();
        tokens = line.split(" ");

        model = tokens[0];
        color = tokens[1];
        wheels = Integer.parseInt(tokens[2]);
        Honda honda = new Honda(model, color, wheels);

        display(bmw, bmw.getAlloyWheelsCount());
        display(honda, honda.getNormalWheelsCount());
    }
}
class BMW extends Car {
    private int alloyWheels;
    BMW(String model, String color, int alloyWheels){
        super(model, color);
        this.alloyWheels = alloyWheels;
    }
    int getAlloyWheelsCount() {
        return alloyWheels;
    }
}

class Honda extends Car {
    private int normalWheels;
    Honda(String model, String color, int normalWheels) {
        super(model, color);
        this.normalWheels = normalWheels;
    }
    int getNormalWheelsCount() {
        return normalWheels;
    }
}