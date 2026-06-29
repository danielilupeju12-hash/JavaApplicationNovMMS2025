//MAD LIBBS GAME PROJECT
import java.util.Scanner;
public class Libbs{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		String adjective1;
		String verb1;
		String noun1;
		String adjective2;
		String verb2;
		String noun2;
		String verb3; 
		
		System.out.print("Enter an adjective1:" );
		adjective1 = scan.nextLine();
		
		System.out.print("Enter an verb1:" );
		verb1 = scan.nextLine();
		
		System.out.print("Enter an noun1:" );
		noun1 = scan.nextLine();
		
		System.out.print("Enter an adjective2:" );
		adjective2 = scan.nextLine();
		
		System.out.print("Enter an noun2:" );
		noun2 = scan.nextLine();
		
		System.out.print("Enter an verb2:" );
		verb2 = scan.nextLine();
		
		System.out.print("Enter an verb3:" );
		verb3 = scan.nextLine();
		
		
		System.out.println("I saw baobali " + adjective1 + " under the table.");
		
		System.out.println("He began " + verb1 + " when he saw luffy enter gear5.");
		
		System.out.println("I was chilling in my house when i saw " + noun1 + verb3 + " at full speed lookig terrified.");
		
		System.out.println("Then i saw him, and I was like " + noun1 + " whats wrong bro.");
		
		//i will show u what i am working on before i show my , let me finish, u will be stunned
		System.out.println("Then he said, i made luffy " + adjective2 + " and he just entered gear5 like, what did i do.");
		
		System.out.println("Then i said, i am for your loss bro.");
		
		scan.close();
	}

}