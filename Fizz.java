//Imagine the interviewer says:"Write a Java program that prints numbers from 1 to 20. 
//But for multiples of 3, print 'Fizz' instead of the number.
// For multiples of 5, print 'Buzz'. 
//And for numbers that are multiples of both 3 and 5, print 'FizzBuzz'."
//My code For improving my self
public class Fizz{
	public static void main(String[] args){
			int num = 1;
			
			while(num <= 20){
				if(num % 3 == 0 && num % 5 == 0){
					System.out.println("fizzBuzz");
				}
				else if(num % 5 == 0){
					System.out.println("buzz");
				}
				else if(num % 3 == 0){
					System.out.println("Fizz");
				}
				else{
					System.out.println(num);
				}
			num++;
			}
	
	}
}
					
		