import java.util.Scanner;
 public class MultipleSwicthCaseStatement{
	 public static void main(String[] args){
		 Scanner input = new Scanner(System.in);
		 
	 System.out.print("Enter your full name:");
	 String fullName = input.nextLine();
	 
	 System.out.print("Enter your mark:");
	 int mark = input.nextInt();
	 
	 switch (mark/10){
	    case 1:
	    case 2:
		case 3:
		case 4:
		    System.out.printf("======================\n\n");
			System.out.printf("Student Name: %s%n",fullName);
			System.out.printf("Student Mark: %d%n",mark);
			System.out.printf("Student Grade:F%n");
			System.out.printf("======================\n\n");
		break;
		
		case 5: 
		    System.out.printf("======================\n\n");
			System.out.printf("Student Name: %s%n",fullName);
			System.out.printf("Student Mark: %d%n",mark);
			System.out.printf("Student Grade:C%n");
			System.out.printf("======================\n\n");
		break;
		
		case 6:
		    System.out.printf("======================\n\n");
			System.out.printf("Student Name: %s%n",fullName);
			System.out.printf("Student Mark: %d%n",mark);
			System.out.printf("Student Grade:B%n");
			System.out.printf("======================\n\n");
		break;
		
		case 7:
		case 8:
		case 9:
		case 10:
		    System.out.printf("======================\n\n");
			System.out.printf("Student Name: %s%n",fullName);
			System.out.printf("Student Mark: %d%n",mark);
			System.out.printf("Student Grade:A%n");
			System.out.printf("======================\n\n");
		break;
		default:
		        System.out.println("Invalid input");
	 
	 }
 }
		    
 }	    
		 
 
	 
	 