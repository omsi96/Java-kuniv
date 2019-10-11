import java.util.Scanner;


public class Exc_2 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
	 
		
		Person person1 = new Person("Omar", 23, 1, 9);
		person1.age.setDays(-5);
		System.out.println(person1);
	

	}
	
	
	
	static void arrays()
	{		
		System.out.println("Type number of elmeents inside the array");
		int arraySize = 0;
		arraySize = scanner.nextInt();
		int studentsGrades[] = new int[arraySize]; 
		// filling array
		int counter =  0;
		for(; counter < studentsGrades.length; counter++)
		{
			System.out.println("Type student grade. (-1 to exit)");
			int n = scanner.nextInt();
			if(n == -1)
				break;
			// we continue 
			studentsGrades[counter] = n;
		}
		
		printArray(studentsGrades, counter);
		
		System.out.println("Enter an element to search for in the previous array");
		int key = scanner.nextInt();
		if(elementExists(studentsGrades, key))
		{
			System.out.println("This element exists");
		}
		else {
			System.out.println("This element doesn't exist!");
		}
		
		// Index 
		
		int index = indexOfElementInArray(studentsGrades, key);
		if (index != -1)
		{
			System.out.println("The index of the elemnt " +
								key + 
								" is " + 
								index);
		}
		
		
	}
	
	
	static boolean elementExists(int array[], int key)
	{
		
		
		for(int i=0; i<array.length; i++)
		{
			if(array[i] == key)
				return true;
		}
		return false;
	}
	
	
	static int indexOfElementInArray(int array[], int key)
	{
		for(int i=0; i<array.length; i++)
		{
			if (array[i] == key)
				return i;
		}
		return -1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void printArray(int array[]) 
	{
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static void printArray(int array[], int counter) 
	{
		for(int i=0; i<counter; i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	static void question2() {
		System.out.println("QUESTION2");
		int n1, n2;
		System.out.println("Enter first integer");
		n1 = scanner.nextInt();
		System.out.println("Enter second integer");
		n2 = scanner.nextInt();

		int subtract = n1 - n2;
		if (subtract < 0)
			subtract = subtract * -1;
		System.out.println("|" + n1 + " - " + n2 + "| = " + subtract);
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static void question1() {
		System.out.println("QUESTION 1");
		// 1. // datatypes: premitive types: int, double, float, char, boolean
		int n1, n2;
		
		
		System.out.print("Enter first integer: ");
		n1 = scanner.nextInt();
		System.out.print("Enter second integer: ");
		n2 = scanner.nextInt();
		
		// check if n1 is multiple of n2
		if (n2 == 0)
		{
			System.out.println("INVALID");
		}
		else {
			
			if(n1 % n2 == 0)
			{
				System.out.println(n1 + " is multiple of " + n2);
			}
			else 
			{
				System.out.println(n1 + " is not multiple of " + n2);

			}
			
		}

	}

	
	
	
	static void question3() {
		System.out.println("QUESTION3");
		
		int five_d_number;
		System.out.println("Enter five-digit integer");
		five_d_number = scanner.nextInt();
		// to check if the number is a 5 digit number
		if(five_d_number >= 10000 && five_d_number <= 99999)
		{
			int n1, n2, n3, n4, n5;
			n1 = five_d_number % 10;
			five_d_number = five_d_number / 10;
			n2 = five_d_number % 10;
			five_d_number = five_d_number / 10;
			n3 = five_d_number % 10;
			five_d_number = five_d_number / 10;
			n4 = five_d_number % 10;
			five_d_number = five_d_number / 10;
			n5 = five_d_number % 10;
			five_d_number = five_d_number / 10;
			
			System.out.println("" + n1 + n2 + n3 + n4 + n5);
			
		}
		else {
			System.out.println("you should input a 5 digit number");
		}
		
			
	}
	
	
	
	static void question4() {
		System.out.println("QUESTION4");
		
		String number;
		System.out.println("Give me a string");
		number = scanner.next();
		
		for(int i=0; i <  number.length(); i++)
		{
			System.out.println(number.charAt(i));
		}
	}
	
}
