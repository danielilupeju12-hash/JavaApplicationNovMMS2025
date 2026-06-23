 import java.util.Scanner;
public class SwitchLearn{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a Day of the week:");
		int dayoftheWeek = scan.nextInt();
		
		switch(dayoftheWeek){
			case 1:
			    System.out.printf("======================\n\n");
			    System.out.println("---Today is Sunday (>_<)");
				System.out.printf("======================\n\n");
		    break;
			
			case 2:
			    System.out.printf("======================\n\n");
			    System.out.println("---Today is Monday");
				System.out.printf("======================\n\n");
		    break;
			
			case 3:
                System.out.printf("======================\n\n");
			    System.out.println("---Today is Teusday");
				System.out.printf("======================\n\n");
		    break;
			
			case 4:
			    System.out.printf("======================\n\n");
			    System.out.println("---Today is Wednesday");
				System.out.printf("======================\n\n");
		    break;
			
			case 5:
			    System.out.printf("======================\n\n");
			    System.out.println("---Today is Thursday");
				System.out.printf("======================\n\n");
		    break;
			
			case 6:
			    System.out.printf("======================\n\n");
			    System.out.println("---Today is Friday");
				System.out.printf("======================\n\n");
		    break;
			
			case 7:
			    System.out.printf("======================\n");
			    System.out.println("---Today is Sartuday");
				System.out.printf("======================\n\n");
		    break;
			
			default:
			    System.out.println("---Invalid day of the week");
		     
		}
	}
}	