import java.util.Scanner;
public class Oden{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int time;
		
		System.out.print("put in the hour of the day: ");
		time = scan.nextInt();
		
		if (time < 12){
			System.out.println("(>_<)Good Morning");
		}
		 else if (time < 18){
			System.out.println("(>_<)Good Afternoon");
		}
		else {
			System.out.println("(>_<)Good Evening");
		}
	}
}
		
		