public class TypeCasting{
	public static void main(String[] args){
		int maxScore = 500;
		int userScore = 423;
		double percentage = (double) userScore / maxScore * 100.00d;
		System.out.println("Percentage:" + percentage);
		String txt = "jjhhrhffjfjjdjd";
		System.out.println("The length of the text is " + txt.length());
		String text = "Hello World";
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());
		String txlt = "Hello";
		System.out.print(txlt.charAt(3));
	}
}