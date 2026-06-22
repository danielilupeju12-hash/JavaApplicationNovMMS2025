import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the distance traveled in kilometers
        System.out.print("Input your Distance: ");
        double distance = scanner.nextDouble();

        // Read the time taken in hours
        System.out.print("Input your Time:");
        double time = scanner.nextDouble();

        // TODO: Calculate the average speed in kilometers per hour
        double averageSpeed = distance / time;

        // Print the average speed rounded to 2 decimal places
        System.out.printf("%.2f", averageSpeed);
    }
}