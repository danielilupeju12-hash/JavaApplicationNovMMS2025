import java.util.Scanner;
public class Nammess{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in); 
		
		System.out.print("Enter your name:");
		String name = scan.nextLine();
		
		System.out.print("Enter your age:");
		int age = scan.nextInt();
		
		System.out.print("Enter your GPA:");
		double gpa = scan.nextDouble();
		
		System.out.print("Are you a student(true/false):");
		boolean isStudent = scan.nextBoolean();
		
		System.out.printf("Your name is %s%n",name);
		System.out.printf("Your age is %d%n",age);
		System.out.printf("Your gpa is %.2f%n",gpa);
		
		if(isStudent == true){
			System.out.printf("You are a studentof this college");
			
        }
        else{
			System.out.println("You are NOT a student of this school");
		}
		scan.close(); 
	}
}	