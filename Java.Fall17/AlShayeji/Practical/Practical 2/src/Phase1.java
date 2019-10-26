//Dalal Alhazeem 2141112790
import java.util.Scanner;
import java.util.Random;
public class Phase1 {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n; 
		 System.out.print("Enter the size n:");
		 n = input.nextInt();
		 while(n < 2 || n > 6)
			 {
			 	System.out.print("Wrong size ");
			 	System.out.print("\nEnter the size n: ");
			 	n = input.nextInt();
			 }
		 
		 int[][] array = fillRandom(n); 
		 for (int i = 0 ; i < array.length ; i++)
			 {
			 	for(int j = 0 ; j < array[i].length ; j++)
			 		 System.out.printf("%d " , array[i][j]);
			 	System.out.println("");
			 }
		
		 double average =  findAvg(array); 
		 System.out.printf("\nThe average is: %.2f" , average);
			System.out.println("");

		 change(array);
		 
		 
	}
	
	public static int[][] fillRandom(int n)
	{
		long seed = 0;
		Random rand = new Random(seed );
		int[][] array = new int [n][n]; 
		for(int i = 0 ; i < array.length ; i ++)
		{
			for (int j = 0 ; j < array[i].length ; j++)
				array[i][j] = rand.nextInt(41) + 10 ; 
		}
		return array; 
	}
	
	public static double findAvg(int[][] array )
	{
		double sum = 0 ;
		double average ; 
		for(int i = 0 ; i < array.length ; i++)
		{
			for(int j = 0 ; j < array.length ; j++)
			{
				sum = sum + array[i][j] ; 
			}
		}
		average = sum / (array.length * array.length) ; 
		return average  ;
	}
	
	public static void change(int[][] array)
	{
		double average = findAvg(array) ; 
		for(int i = 0 ; i < array.length ; i++)
		{
			for (int j = 0 ; j < array[i].length ; j++)
				{
					if (array[i][j] > average )
						 System.out.printf("* ") ;
					else 
						System.out.printf("%d " , array[i][j]);
					
				}
			System.out.println("");
			//for(int k = 0 ; k < array[i].length ; k++)
				 
		}
	}
}
// The average is: 35.44
/*
 ********************* 
 Phase2 : Fill 2D array with unique integers .. 
*/