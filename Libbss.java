//MAD LIBBS GAME PROJECT
import java.util.Scanner;
public class Libbss{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		
		
		int score = 0;
		int tries = 5;
		int i = 1;
		
		while(i <= 5){
		
		System.out.println("========================================================================================\n");
		System.out.println("-Fill in the empty spaces that have empty spaces in then, from the options lettered (a-d)\n");
		System.out.println("========================================================================================\n");
		System.out.println("-I saw kaido ___1___ under the  table.");
		System.out.println("-He then began  ___2___  when he saw luffy enter gear5.");
		System.out.println("-I was chilling in my house when I saw  ___3___");
		System.out.println("-He was  ___4___ towards my house full speed looking terified");
		System.out.println("-Then I saw him, and I was like  ___5___  whats wrong bro.");
		//i will show u what i am working on before i show my , let me finish, u will be stunned
		System.out.println("-Then he said, i made luffy so  ___6___  and he just entered gear5 like, what did I do.");
		System.out.println("-Then I  ___7___  I was like your loss bro.");
		
		String word1 = "";
		String word2 = "";
		String word3 = "";
		String word4 = "";
		String word5 = "";
		String word6 = ""; 
		String word7 = "";
		
	    char question1;
		char question2;
		char question3;
		char question4;
		char question5;
		char question6;
		char question7;
		
		System.out.print("1.) a.Akainu  b.Flying  c.Hiding  d.Running. Ans=");
		question1 = scan.next().charAt(0);
		if(question1 == 'c'){
			System.out.println("You are correct");
			score++;
			System.out.println("You got " + score + " mark");
			System.out.println("you have " + tries + " more tries");
		}
		else{
			System.out.println("You are wrong.Option (c.) is the correct option");
			System.out.println("============================================");
			tries--;
			System.out.println("You have " + tries + " more tries");
			System.out.println("Your score is still " + score);
			System.out.println("============================================\n\n");
		}
		switch(question1){
			case 'a': word1 = "Akainu";
		break;
			case 'b': word1 = "	Flying";
		break;
		    case 'c': word1 = "Hiding";
		break;
		    case 'd' : word1 = "Running";
		break;
		default:
	            System.out.println("Invalid option");
		}
		
		
		System.out.print("2.) a.Screaming  b.Vital  c.Under  d.Taxing. Ans=");
		question2 = scan.next().charAt(0);
		if(question2 == 'a'){
			System.out.println("You are correct");
			score++;
			System.out.println("You got " + score + " mark");
			System.out.println("you have " + tries + "more tries");
		}
		else{
			System.out.println("You are wrong.Option (a.) is the correct option");
			System.out.println("============================================");
			tries--;
			System.out.println("You have " + tries  + " more tries");
			System.out.println("Your score is still " + score);
			System.out.println("============================================\n\n");
		}
		
		switch(question2){
			case 'a': word2 = "Screaming";
		break;
			case 'b': word2 = "	Vital";
		break;
		    case 'c': word2 = "Under";
		break;
		    case 'd' : word2 = "Taxing";
		break;
		default:
	            System.out.println("Invalid option");
		}


        System.out.print("3.) a.Kaido  b.Running  c.Slept  d.Eating. Ans=");
		question3 = scan.next().charAt(0);
		if(question3 == 'a'){
			System.out.println("You are correct");
			score++;
			System.out.println("You got " + score + " mark");
			System.out.println("you have " + tries + "more tries");
		}
		else{
			System.out.println("You are wrong.Option (a.) is the correct option");
			System.out.println("============================================");
			tries--;
			System.out.println("You have " + tries + " more tries");
			System.out.println("You have " + score + " marks");
			System.out.println("============================================\n\n");
		}
		
		switch(question3){
			case 'a': word3 = "Kaido";
		break;
			case 'b': word3 = "	Running";
		break;
		    case 'c': word3 = "Slept";
		break;
		    case 'd' : word3 = "Eating";
		break;
		default:
	            System.out.println("Invalid option");
		}
		
		
		System.out.print("4.) a.Bleeting  b.Fighting  c.Fissing  d.Running. Ans=");
		question4= scan.next().charAt(0);
		if(question4 == 'd'){
			System.out.println("You are correct");
			score++;
			System.out.println("You got " + score + " mark");
			System.out.println("you have " + tries + "more tries");
		}
		else{
			System.out.println("You are wrong.Option (d.) is the correct option");
			System.out.println("============================================");
			tries--;
			System.out.println("You have " + tries + " more tries");
			System.out.println("You have " + score + " marks");
			System.out.println("============================================\n\n");
        }
        switch(question4){
			case 'a': word4 = "Bleeting";
		break;
			case 'b': word4 = "	Fighting";
		break;
		    case 'c': word4= "Fissing";
		break;
		    case 'd' : word4 = "Running";
		break;
		default:
	            System.out.println("Invalid option");
		}
		
		
        System.out.print("5.) a.When  b.Kaido  c.Punching  d.Sin. Ans=");
		question5 = scan.next().charAt(0);
		if(question5 == 'b'){
			System.out.println("You are correct");
			score++;
			System.out.println("You got " + score + " mark");
			System.out.println("you have " + tries + "more tries");
	    }
		else{
			System.out.println("You are wrong.Option (b.) is the correct option");
			System.out.println("============================================");
			tries--;
			System.out.println("You have " + tries + " more tries");
			System.out.println("You have " + score + " marks");
			System.out.println("==========================================\n\n");
		}
		switch(question5){
			case 'a': word5 = "When";
		break;
			case 'b': word5 = "	Kaido";
		break;
		    case 'c': word5 = "Punching";
		break;
		    case 'd' : word5 = "Sin";
		break;
		default:
	            System.out.println("Invalid option");
		}
		
		
        System.out.print("6.) a.Angry  b.Happy  c.Sing  d.Delulu. Ans=");
		question6 = scan.next().charAt(0);
		if(question6 == 'a'){
			System.out.println("You are correct");
			score++;
			System.out.println("You got " + score + " mark");
			System.out.println("you have " + tries + "more tries");
		}
		else{
			System.out.println("You are wrong.Option (a.) is the correct option");
			System.out.println("============================================");
			tries--;
			System.out.println("You have " + tries + " more tries");
			System.out.println("You have " + score + " marks");
			System.out.println("==========================================\n\n");
		}
		switch(question6){
			case 'a': word6 = "Angry";
		break;
			case 'b': word6 = "	Happy";
		break;
		    case 'c': word6 = "Sing";
		break;
		    case 'd' : word6 = "Delulu";
		break;
		default:
	            System.out.println("Invalid option");
		}
		
		
		System.out.print("7.) a.Spoke  b.Speak  c.Said  d.Spell. Ans=");
		question7 = scan.next().charAt(0);
		if(question7 == 'c'){
			System.out.println("You are correct");
			score++;
			System.out.println("You got " + score + " mark");
			System.out.println("you have " + tries + "more tries");
		}
		else{
			System.out.println("You are wrong.Option (c.) is the correct option");
			System.out.println("============================================");
			tries--;
			System.out.println("You have " + tries + " more tries");
			System.out.println("You have " + score + " marks");
			System.out.println("==========================================\n\n");
		}
		switch(question7){
			case 'a': word7 = "Spoke";
		break;
			case 'b': word7 = "Speak";
		break;
		    case 'c': word7 = "Said";
	    break;
		    case 'd' : word7 = "Said";
		break;
		default:
	            System.out.println("Invalid option");
		}
		
		System.out.println("============================================================================================\n");
		System.out.println("This is your input");
		System.out.println("-I saw kaido " + word1 + " under the table.");
		System.out.println("-He began " + word2 + " when he saw luffy enter gear5.");
		System.out.println("-I was chilling in my house when i saw " + word3);
		System.out.println("-He was " + word4 + " towards my house at full speed looking terified");
		System.out.println("-Then I saw him, and I was like " + word5 + " whats wrong bro.");
		//i will show u what i am working on before i show my , let me finish, u will be stunned
		System.out.println("-Then he said, I made luffy " + word6 + " and he just entered gear5 like, what did I do.");
		System.out.println("-Then I " + word7 + " I am for your loss bro.");
		System.out.println("========================================================================================\n");
		
		char yesornoChoice;
        		
		System.out.println("to play again or not pick yes or no(y/n)");
		yesornoChoice = scan.next().charAt(0);
		
		if(yesornoChoice == 'y'){
			System.out.println("You have " + tries + " tries to go");
		i++;
	    }
		else if(yesornoChoice == 'n'){
	    break;
		}
        else{
			System.out.println("Invalid, exitng game");
		break;
        }	
		
		}

		
		scan.close();
	}

}