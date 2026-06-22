import java.util.Scanner;
public class UserNumberss{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int numzy;
		int i = 1;
		int sum = 0;
		int product = 1;
		int average = 0;
		
		while (i <= 10){
			System.out.printf("Enter a number:");
			numzy =scan.nextInt();
			sum += numzy;
			product *= numzy;
			i++;
		}
		System.out.println("The average of all the numbers are " + sum/10);
		System.out.println("The sum of all the numbers are " + sum);
		System.out.println("The product of all the numbers are "  + product);
	}
}
		
			
		