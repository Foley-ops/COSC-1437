import java.util.Arrays;

public class NumberCruncherApp {

    public static void main(String[] args) {
        // create array of 11 random integers
        var numbers = new int[11];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 51);  // num is >= 0 and <= 50
        }
        
        // sort the array
        Arrays.sort(numbers);   
        
        // get number string and calculate total
        String numberString = "";
        int total = 0;
        for (int number : numbers) {
            numberString += number + " ";
            total += number;
        }
        // display number string and total
        System.out.println("Numbers: " + numberString);
        System.out.println("Total: " + total);
        
        // get count of numbers and display
        int count = numbers.length;
        System.out.println("Count: " + count);
        
        // calculate average and display
        double average = (double) total / count;
        average = (double) Math.round(average * 10) / 10;
        System.out.println("Average: " + average);
        
        // if count of numbers is odd
        if (count % 2 != 0) {
            int medianIndex = count / 2;
            int median = numbers[medianIndex];
            System.out.println("Median: " + median);            
        }
    }    
}
