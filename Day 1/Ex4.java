import java.util.Scanner;


public class Ex4 
{
	static Scanner input = new Scanner(System.in);

	
	public static void main(String[] args) 
	{
//		runBmi();
		int n = 3;
		printBana(n);
	}
	
	public static void runBmi(){
		System.out.print("Type your weight (KG) ");
		double weight = input.nextDouble();
		System.out.print("Type your height (m) ");
		double height = input.nextDouble();
		
		double bmi = weight / Math.pow(height, 2);
		printStatus(bmi);	
	}
	
	
	public static double calculateBMI(double weight, double height)
	{
		return weight / (height * height);
	}
	
	public static void printStatus(double bmi){
		if(bmi <= 20)
		{
			System.out.println("You are thin");
		}
		else if(bmi <= 25){
			System.out.println("You are normal w mafeek ella el3afyaa");
		}
		else{
			System.out.println("You are Botamba KAssar Ellamba");
		}
	}
	
	public static void printBana(int numberOFTImesToPRintBAnana)
	{
		for(int i = 0; i < numberOFTImesToPRintBAnana; i++)
		{
			System.out.println("Banana ");
		}
	}

}
