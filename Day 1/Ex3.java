import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// control statements 
		
		System.out.print("Type your weight (KG) ");
		double weight = input.nextDouble();
		System.out.print("Type your height (m) ");
		double height = input.nextDouble();
		
		double bmi = weight / Math.pow(height, 2);
		System.out.println("Your bmi = " + bmi);
		
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

}
