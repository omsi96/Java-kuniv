// Dalal Hamed Alhazeem ID 2141112790
import java.util.Scanner;
public class Phase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a ; 
		int b ; 
		
		
		int choice ; 
		int n = 0 ; 
		int factor ; 
		
		System.out.print("Enter a range: ");
		a = input.nextInt();
		b = input.nextInt(); 
		
		System.out.print("1.  Increment\n2.  Decrement\n");
		
		
			
		do
		{
			System.out.print("Choose an option :");
			choice = input.nextInt();
			
			switch (choice )
			{
			case 1: 
				if ( a < b )
				{
					System.out.println("Enter the icrement factor: ");
					factor = input.nextInt(); 
					System.out.print("The numbers are: ");

					for ( int i = a ; i <= b ; i = i + factor)
					{
						System.out.printf("%d " , i);
					}
					n = -1 ; 

				}
				else 
					System.out.println("wrong choice! A > B ");
				break ; 
				
			case 2 : 
				if ( a > b)
				{
					System.out.print("Enter the decrement factor: ");
					factor = input.nextInt(); 
					System.out.print("The numbers are: ");
					for ( int i = a ; i >= b ; i = i - factor)
					{
						System.out.printf("%d " , i);
					}
					n = -1 ; 
				}
				
				else 
					System.out.println("wrong choice A < B");
				break ; 
				
				default : 
					if (a <= 0 || b <= 0 )
					{
						System.out.println("Invalid Range !! ");
						break ; 
					}
					
					if ( a == b )
					{
						System.out.println("Wronge choice ! A = B  ");
						break ; 
					}
					System.out.println("Wrong choice! No such choice");
					break ; 
			}
		}while(n!=-1);
	}

}
/*
 * Enter a range: 2 9 
1.  Increment
2.  Decrement
Choose an option :11
Wrong choice! No such choice
Choose an option :2
wrong choice A < B
Choose an option :1
Enter the icrement factor: 
2
The numbers are: 2 4 6 8 
*/ 
