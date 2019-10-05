import java.util.Scanner;


public class X_O {

	public static char  c1 = '1',
						c2 = '2',
						c3 = '3',
						c4 = '4',
						c5 = '5',
						c6 = '6',
						c7 = '7',
						c8 = '8',
						c9 ='9';
	
	
	
	public static void printBoard()
	{
		System.out.println("\t    " + c1 + "\t    " + c2 + "\t    "  + c3);
		System.out.println("\t    " + c4 + "\t    " + c5 + "\t    "  + c6);
		System.out.println("\t    " + c7 + "\t    " + c8 + "\t    "  + c9);
	}
	
	public static void takeValue()
	{
		System.out.print("X: ... ");
		Scanner input = new Scanner(System.in);
		if (input.nextInt() == 1)
			c1 = 'X';
	}
	
	public static void main(String[] args) {
		
		printBoard();
		takeValue();
		printBoard();
		// TODO Auto-generated method stub
		
		// /*
		
		/*
		 * 1. Print the x o game 
		 * 
		 *    1  |  2  |  3
		 *    4  |  5  |  6
		 *    7  |  8  |  9
		 *    
		 *     choose number to play X
		 *     
		 *  x: 1
		 *    X  |  2  |  3
		 *    4  |  5  |  6
		 *    7  |  8  |  9
		 * 
		 *  o: 5
		 *  
		 *    X  |  X  |  X
		 *    4  |  O  |  6
		 *    7  |  8  |  9
		 *  
		 */
	}

}
