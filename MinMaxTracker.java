import java.util.Scanner;

public class MinMaxTracker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var i = 1;
        int num;
        
        // Initialize with extreme values so the first inputs override them
        int max = Integer.MIN_VALUE; 
        int min = Integer.MAX_VALUE; 

        while (i <= 5) {
            System.out.print("Input your number: ");
            num = scan.nextInt();

            // Track the maximum value
            if (num > max) {
                max = num;
            }
            
            // Track the minimum value
            if (num < min) {
                min = num;
            }

            i++;
        }

        System.out.println("1. The highest number entered is: " + max);
        System.out.println("2. The lowest number entered is: " + min);
    }
}
