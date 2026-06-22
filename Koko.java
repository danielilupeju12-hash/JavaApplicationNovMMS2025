import java.util.Scanner;
public class Koko{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int myAge;
		int votingAge = 18;
		
		System.out.print("----Enter your age:");
		myAge = scan.nextInt();
		
		if(myAge < votingAge){
			System.out.println("----You are to young to VOTE!!!!! Come back when You are 18");
		}
		else if(myAge > votingAge){
			System.out.println("----You are old enough to vote");
		}
		else{
			System.out.println("----Invalid Input");
		}
		scan.close();	
	}
}
		
		