/*
 * Omar Saeed AlIbrahim
 * 214 111 6102
 * Java 201 Mohammad alshayji
 * Homework 3 part 1 
 */




import java.util.Scanner;
public class MainTest {

		Scanner input = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.print("Enter coordinate of your point : ...");
		int x , y , z ;
		
		x = input.nextInt();
		y = input.nextInt();
		z = input.nextInt();
		
		Point p = new Point(x,y,z);
		
		int a = 0 ;
		do {
			
		// Promting and taking value
		System.out.println("\n\n\t1. Change X");
		System.out.println("\t2. Change Y");
		System.out.println("\t3. Change Z");
		System.out.println("\t4. Negate Point");
		System.out.println("\t5. Print");
		System.out.println("\t6. Find Norm");
		System.out.print("\nWhat do you wanna do?");
		a = input.nextInt();
		
		// Actions here
		
		switch (a) {
		
		case 1 : 
			System.out.print("The new value of X = ");
			p.setX(input.nextInt());
			break;
		
		case 2 : 
			System.out.print("The new value of Y = ");
			p.setY(input.nextInt());
			break;
			
		case 3 : 
			System.out.print("The new value of Z = ");
			p.setZ(input.nextInt());
			break;
			
		case 4 : 
			p.negate();
			break;
			
		case 5 : 
			p.print();
			break;
			
			
		}
		
		}
		while (a != 6);
			
		if (a = 6){
			System.out.printf("The norm is %.2f ",p.norm());
		}
		
	}

}
