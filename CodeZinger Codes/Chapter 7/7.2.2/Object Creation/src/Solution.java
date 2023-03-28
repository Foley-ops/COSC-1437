public class Solution {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Object created successfully");
        Student.display();
    }
}
class Student {
    public static void display() {
        System.out.println("display function called successfully");
    }
}