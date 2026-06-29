public class Maxx{
	public static void main(String[] args){
		String name = "Bullzer";
		int age = 39;
		
		String formattedString = String.format("My name is %s and i am %d years old",name, age);
		
		System.out.println(formattedString);
	}
}