import java.util.Scanner;
public class GradeSwicthChecker{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your Grade:");
		char grade = Character.toUpperCase(scan.next().charAt(0));
	
		
		switch(grade){
			case 'A':
			    System.out.println("Exelent Performance, Dont relent!!!");
		break;
		    case 'B':
			    System.out.println("Good work. But do better");
		break; 
		    case 'C':
			    System.out.println("Try Harder");
		break;
		    case 'F':
			    System.out.println("TOO BAD!!!!, But there is plenty of Room for improvement");
		break;
		default:
		       System.out.println("Invalid input");
		}
	}
}
			    