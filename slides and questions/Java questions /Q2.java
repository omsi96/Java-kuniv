
  /*This program will take a string from the user 
    and then by using for loop we will make
    every char in different line 
   */
  
  import java.util.Scanner;


  public class Q2 
  {
	  public static void main(String[] args) 
	  {
		  Scanner input = new Scanner(System.in);
		  
		  String sentence = null;
		  
		  //print the sentence and take a sentence from the user
		  System.out.print("Please enter a sentence: ");
		  sentence = input.nextLine();
		  
		  //print 
		  System.out.println("Your sentence printed vertically is :");
		  
		  
		  if(sentence != null)
		  {
			  
			  //for loop so i can print the sentence vertically 
			  //and inside the foe loop we used one of String methods
			  for(int i=0 ; i<sentence.length();i++)
			  {
				  System.out.println(sentence.charAt(i));
				  
				  }
			  }
		  }
	  }
  
  
  
 //The output
 /*Please enter a sentence: Hey there!
Your sentence printed vertically is :
H
e
y
 
t
h
e
r
e
!*/
