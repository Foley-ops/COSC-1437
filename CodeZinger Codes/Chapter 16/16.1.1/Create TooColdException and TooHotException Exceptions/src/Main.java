public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        try {
            int result = customer.giveCupOfCoffee(30);
            System.out.println(result);
        } catch (TooColdException e) {
            System.out.println("Too Cold");
        } catch (TooHotException e) {
            System.out.println("Too Hot");
        }
    }
}
