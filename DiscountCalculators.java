import java.util.Scanner;
public class DiscountCalculators{
	public static void main(String[] args){
		Scanner scan =new Scanner(System.in);
		
		System.out.print("Original Price:");
		double originalPrice = scan.nextDouble();
		
		System.out.print("Discount Amount:");
		double discountAmount = scan.nextDouble();
		
		double discountPercentage = (originalPrice * discountAmount/100);
		
		double finalPrice = (originalPrice - discountPercentage);
		
		System.out.println("Final Price:$" + finalPrice);
	}
}