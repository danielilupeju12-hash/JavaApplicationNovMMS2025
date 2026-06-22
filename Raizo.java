import java.util.Scanner;
public class Raizo{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int i = 1;
		int num;
		int sum = 0;
		int product = 1;
		int average = 0;
		
		while (i <= 9){
			System.out.print("Input your number: ");
			num = scan.nextInt();
			sum += num;
			product *= num;
			i++;
		}
			System.out.println("1.the sum of 9 numbers is " + sum);
			System.out.println("2.the product of 9 numbers is " + product);
			System.out.println("3.the average of 9 numbers is " + sum/9);
			
	}
}