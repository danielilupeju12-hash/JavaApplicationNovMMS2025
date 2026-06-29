import java.util.Scanner;
public class Namm{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("Enter your Age:");
		int age = scanner.nextInt(); 
		scanner.nextLine();
		
		System.out.print ("Enter your favorite colour:");
		String colour = scanner.nextLine();
		
		System.out.println("You are " + age + " years old");
		System.out.println("You like the colour " + colour);
		
	}
}
		  