import java.util.Scanner;
public class ElseIfStatement{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int weather ;
		int isRainy = 1;
		int isCold = 2;
		int isSunny = 3;
		
		System.out.print("Enter a number from (1.Rainy, 2.Cold, 3.Sunny): ");
		weather= scan.nextInt();
		
		if (weather == 1){
			System.out.print("1.Carry your Umbrella");
		}
		else if (weather == 2){
			System.out.print("2.Carry your Sweater");
		}
		else if (weather == 3){
			System.out.print("3.Stay at home");
		}
		else{
			System.out.print("4.Invalid weather choice");
		}
			
			
	}
}
			