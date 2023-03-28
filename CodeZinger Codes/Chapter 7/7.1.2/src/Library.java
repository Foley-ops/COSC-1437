import java.util.Scanner;

public class Library {
    private int acc_num;
    private String title;
    private String author;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library book = new Library();

        int acc_num = scanner.nextInt();
        scanner.nextLine();
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int lateDays = scanner.nextInt();

        book.setValues(acc_num, title, author);
        book.display();
        System.out.println(book.compute(lateDays));
    }
    public void setValues(int acc_num, String title, String author) {
        this.acc_num = acc_num;
        this.title = title;
        this.author = author;
    }

    public int compute(int lateDays){
        return lateDays * 2;
    }

    public void display(){
        System.out.println(acc_num + " " + title + " " + author);
    }
}
