public class BackCounting{
	public static void main(String[] args){
		int num = 1234;
		while(num % 10 == 4){
			System.out.println(num);
			num++;
		}
	}
}