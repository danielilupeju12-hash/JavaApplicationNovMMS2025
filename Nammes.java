import java.util.Scanner;
public class Nammes{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in) 
		
		System.out.print("Enter your name:");
		String name = scan.nextLine();
		
		System.out.print("Enter your age:");
		int age = scan.nextInt();
		
		System.out.print("Enter your GPA:");
		double gpa = scan.nextDouble();
		
		System.out.print("Your name is \n" + name "I am" + age + "years old\n" + "My GPA is:" + gpa);
	}
}	