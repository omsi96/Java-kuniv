import java.util.Scanner;


public class Ex1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		// Ex 1.
		// intro 
		String greetingMessage = "Hello World";
		int age = 23;
		double pi = 3.14;
		String name = "Omar";
		
		String sentence = greetingMessage +  
							"\n" + 
							name + 
							" You are " + 
							age + 
							", and pi = " + 
							pi;
		
		System.out.println(sentence);
		

	}

}
