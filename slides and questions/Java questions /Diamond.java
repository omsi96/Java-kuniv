
  //this program will take the number of how many 
  //star that going to be in the middle of the diamond

  import java.util.Scanner;
  
  public class Diamond 
  {
	  public static void main(String[] args) 
	  {
		Scanner input = new Scanner(System.in);
		
		int size ;
		
		//print the sentence to ask the user about the length
		System.out.print("Please insert the length of the middle line: ");
		size =input.nextInt();
		
		  
		//we used nested for loops to make diamonds
		
		//the first 3 for loops are for the upper part of the diamond
		for(int i = 1; i <= size; i++)  
		{ 
			for(int j = 1; j <= size-i; j++)
			{
				System.out.print(" ");
	         
			}
	        
			for(int k =1 ; k <= i; k++)
			{
				System.out.print("* ");
	         
			}
	        
			System.out.println();
	      
		}
		  
		//these for loops are for the lower part of the diamond
		for(int i = size-1; i >= 1; i--)
	      {
			for(int j = 1; j <= size-i; j++)
			{
				System.out.print(" ");
	         
			}
			for(int k =1 ; k <= i; k++)
			{
				System.out.print("* ");
	    
			}
	        
			System.out.println();
	      
	      }
	
  }
  }
  
  //output
  
  /*Please insert the length of the middle line: 5
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
    */
  
