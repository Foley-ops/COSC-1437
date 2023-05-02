import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Person {
    private String name;
    private String dateOfBirth;
    private String idNumber;
    private String issueDate;
    private String expirationDate;

    // Constructor
    public Person(String name, String dateOfBirth, String idNumber, String issueDate, String expirationDate) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.idNumber = idNumber;
        this.issueDate = issueDate;
        this.expirationDate = expirationDate;
    }

    // Getters and Setters
    // ...

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    // Generate new ID number
    public String generateNewIdNumber() {
        StringBuilder newId = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            int randomNumber = random.nextInt(10);
            newId.append(randomNumber);
        }

        return newId.toString();
    }

    // Update issue and expiration dates
    public void updateIssueAndExpirationDates() {
        LocalDate currentDate = LocalDate.now();
        this.issueDate = currentDate.format(DateTimeFormatter.ISO_DATE);
        this.expirationDate = currentDate.plusYears(4).format(DateTimeFormatter.ISO_DATE); // Assuming a 4-year renewal period
    }

    // toString method to display the updated information
    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Date of Birth: " + dateOfBirth + "\n" +
                "ID Number: " + idNumber + "\n" +
                "Issue Date: " + issueDate + "\n" +
                "Expiration Date: " + expirationDate;
    }
}
