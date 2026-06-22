import java.util.Scanner;
public class MultipleIfElseIFStatement{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String fullName = scan.nextLine();
		
		System.out.print("Enter your mark: ");
		int mark = scan.nextInt();
		
		if(mark >= 70){
			System.out.printf("======================\n\n");
			System.out.printf("Student Name: %s%n",fullName);
			System.out.printf("Student Mark: %d%n",mark);
			System.out.printf("Student Grade:A%n");
			System.out.printf("======================\n\n");
			
		}
		else if(mark >= 60){
			System.out.printf("======================\n\n");
			System.out.printf("Student Name: %s%n",fullName);
			System.out.printf("Student Mark: %d%n",mark);
			System.out.printf("Student Grade:B%n");
			System.out.printf("======================\n\n");
		}
		else if(mark >= 50){
			System.out.printf("======================\n\n");
			System.out.printf("Student Name: %s%n",fullName);
			System.out.printf("Student Mark: %d%n",mark);
			System.out.printf("Student Grade:C%n");
			System.out.printf("======================\n\n");
		}
		else if(mark >= 40){
			System.out.printf("======================\n\n");
			System.out.printf("Student Name: %s%n",fullName);
			System.out.printf("Student Mark: %d%n",mark);
			System.out.printf("Student Grade:F%n");
			System.out.printf("======================\n\n");
		}
	}
}
		
		
		
		
		
	
