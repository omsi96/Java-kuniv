
  //this  program takes input from the user 
  //then takes this input and put it in a sentence

  import java.util.Scanner;
  import java.util.*;
  
  public class Q3 
  {
	  public static void main(String[] args) 
	  {
		  String fname ; //first name
		  String lname ; //last name
		  String adress;
		  String major;
		  int age;
		  
		  Scanner input = new Scanner(System.in);
		  
		  //print the sentence and take input from he user
		  //here i used nextLine() because it read everything 
		  //before i push enter
		  System.out.println("Student First Name: ");
		  fname = input.nextLine();
		  
		  System.out.println("Student Last Name: ");
		  lname = input.nextLine();
		  
		  System.out.println("Student street adress, area, block and street: ");
		  adress = input.nextLine();
		  
		  System.out.println("Student age: ");
		  age = input.nextInt();
		  
		  System.out.println("student Major: ");
		  major = input.next();
		  
		  
		  
		  System.out.println();
		  
		  
		  System.out.printf("The student %s %s ",fname,lname);
		  
		  System.out.println("who lives in "+adress);
		  
		  System.out.print(",has graduated from KU with a bachelor degree of");
		  
		  System.out.printf("%s on age %d .",major,age);
		  
		 
		  
		

	}

}
  
  //output
  /*Student First Name: 
Noura
Student Last Name: 
Ali
Student street adress, area, block and street: 
Salmiya, Block1, St.20
Student age: 
22
student Major: 
Computer Engineer

The student Noura Ali who lives in Salmiya, Block1, St.20
,has graduated from KU with a bachelor degree ofComputer on age 22 .*/
