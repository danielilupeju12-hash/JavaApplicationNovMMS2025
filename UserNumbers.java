import java.util.Scanner;
public class UserNumbers{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int number;
		int i =1;
		int average = 0;
		int sum=0;
		int product=1;

		while(i <= 10){
		System.out.print("Input numbers: ");
		 number = scan.nextInt();
		 
		 sum +=number;
		 product *=number;
		 i++;
		}
		average = sum/10;
		System.out.printf("the sum of the number is " + sum);
		System.out.printf("the product of the number is " + product);
		System.out.printf("the sum of the number is " + average);
		 
		  
		 
			
		
		
	}
}
		
		
		