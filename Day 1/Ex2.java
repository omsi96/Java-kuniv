import java.util.Scanner;


public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ex2.
		Scanner s = new Scanner(System.in);

		System.out.println("Type your name");
		String name = s.nextLine();
		System.out.println("Type your birth year");
		int birthYear = s.nextInt();
		int age = 2019 - birthYear;
		System.out.println("You are " + 
							name + 
							" and you are " + 
							age +
							" years old!");
	}

}
