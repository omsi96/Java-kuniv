// Dalal Hamed Alhazeem ID : 2141112790

import java.util.Scanner;
public class Phase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a ; 
		int b ; 
		
		
		int choice ; 
		int n = 0 ; 
		int factor ; 
		int counter = 0 ; 
		int even = 0 ; 
		int odd = 0 ; 
		int total = 0 ; 
		double average = 0.0 ; 
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
						counter++;
						total = total + i; 
						if (i%2 == 0)
							even = even + 1;
						else 
							odd = odd + 1 ; 
					}
					average = (double) total / counter ; 
					System.out.printf("%nThe number genarated are %d %n The number of even integers is %d %n The number of odd integers is %d %n The average is %.1f " , counter , even , odd , average );

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
						counter++; 
						total = total + i; 
						if (i%2 == 0)
							even = even + 1;
						else 
							odd = odd + 1 ;
					}
					average = (double) total / counter ; 
					System.out.printf("%nThe number genarated are %d %nThe number of even integers is %d %nThe number of odd integers is %d %nThe average is %.1f" , counter , even , odd , average);
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
