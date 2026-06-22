import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner in = new Scanner(System.in);
        

        // Read the next integer
        int n = in.nextInt(); 

        // Compute and print the square of n
         int square = n * n;
         System.out.println(square);

        // Compute and print the cube of n
        int cube = square * n;
        System.out.println(cube);

        // Compute and print the fourth power of n
        int fourthPowerofn = cube * n;
        System.out.println( fourthPowerofn);
    }
}
