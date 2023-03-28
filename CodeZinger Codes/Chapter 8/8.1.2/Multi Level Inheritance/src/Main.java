import java.util.Scanner;

class HourlyEmployee extends Employee {
    private int hourlyRate;
    private int hoursWorked;
    HourlyEmployee(String name, int id, int hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    public int getGrosspay() {
        return hoursWorked * hourlyRate;
    }


}
class Person {
    private String name;
    Person(String s) {
        setName(s);
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
class Employee extends Person {
    private int id;
    Employee(String sname, int id) {
        super(sname);
        setId(id);
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }
}
class DriverMain {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String NAME = s.nextLine();
        int ID = s.nextInt();
        int HR = s.nextInt();
        int HW = s.nextInt();
        HourlyEmployee hourlyEmployee = new HourlyEmployee(NAME, ID, HR, HW);
        System.out.println(hourlyEmployee.getId());
        System.out.println(hourlyEmployee.getName());
        System.out.println(hourlyEmployee.getGrosspay());
    }
}