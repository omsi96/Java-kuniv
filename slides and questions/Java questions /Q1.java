
  
  /*This program will calculate sphere area and volume
   * It going to take the radius from the user */
  
  import java.util.Scanner;
  
  
  public class Q1 
  {
	  public static void main(String[] args) 
	  {
		  Scanner input = new Scanner(System.in);
		  
		  double area;
		  double volume; 
		  double radius;
		
		  //print the sentence and takes value form the user  
		  System.out.print("Please input the sphere radius: ");
		  radius = input.nextInt();
		  
	      //print the radius 
		  System.out.printf("Radius of Sphere: %.0f ", radius);
		  
		  //to go for the next line
		  System.out.println();
		  
          //to calculate the volume and used casting to make the equation double
		  volume =(double) 4/3 * Math.PI * Math.pow(radius,3);
		  
		  //print the value of volume
		  System.out.printf("Volume: %.2f ",volume);
		    
		  //go to next line
		  System.out.println();
		  
		  //calculate the area and used casting to make it double
		  area = (double) 4 * Math.PI * Math.pow(radius,2);
		  
		  //print the value of the area
		  System.out.printf("Surface area: %.2f ", area);
		  
		  
		
	}

}
  
  
  //The Output
  
  /*Please input the sphere radius: 10
    Radius of Sphere: 10 
    Volume: 4188.79 
    Surface area: 1256.64 
    */
