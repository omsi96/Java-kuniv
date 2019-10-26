
  //Test class for the first Question

  import java.util.Scanner;
		   
  //this is the main of the program 
   /*print the time and date and its going to interact 
    * with the user */
  public class Timetest
  {
	  public static void main(String[] args) 
	  {
		  //Variables
		  int year;
		  String month;
		  int max =0;
		  int day;
		  int hour;
		  int minute;
			
		  //constructor for Scanner
		  Scanner input = new Scanner(System.in);
			
		  //constructor for thr first class Time
		  Time tim = new Time();
			
		  //print 
		  System.out.println("write the date and time you wish to set ");
			
		  System.out.print("please set the year: ");
		  year = input.nextInt(); //input
			
		  //if-else statement for the year to check 
		  //if the user put valid year or not
		  if(year >= 1900 && year <= 2099)
		  {
			  //to set the year that the user wrote
			  tim.setyear(year);	
		  }else
		  {
			  System.out.print("you have entered invalid year, please insert a valid year: ");
			  year = input.nextInt();  
				
		  }
		  //to set the year that the user wrote after the invalid message
		  tim.setyear(year);
			
		  
		  //switch to check if the month is valid or not
		  System.out.print("please set the month: ");
		  month = input.next();
		  
		  //used switch statement for month
		  switch(month)
		  {
		  case "january":
			  max=31;
			  break;
				
		  case "february":
			  max=28;
			  break;
				
		  case "march":
			  max=31;
			  break;
				
		  case "april":
			  max =30;
			  break;
				
		  case "may":
			  max=31;
			  break;
				
		  case "june":
			  max=30;
			  break;
				
		  case "july":
			  max=31;
			  break;
				
		  case "august":
			  max =31;
			  break;
				
		  case "september":
			  max=30;
			  break;
				
		  case "october":
			  max=31;
			  break;
				
		  case "november":
			  max=30;
			  break;
				
		  case "december":
			  max=31;
			  break;
				
			  
		  default:
			  System.out.print("you have entered invalid month, please insert a valid month: ");
			  month = input.next();
			  break;
		  }
		  
		  tim.setmonth(month);
			
			
		  //if-else for day to check invalid and valid day
		  System.out.print("please set the day: ");
		  day = input.nextInt();
			
		  if(day >= 1 && day <= max)
		  {
			  tim.setday(day);	
		  }
		  else
		  {
			  System.out.print("you have entered invalid day, please insert a valid day: ");
			  day = input.nextInt();
		  }
			
		  //to set day
		  tim.setday(day);
		  
		  //used if-else to check valid and invalid hour
		  System.out.print("please set the hour: ");
		  hour = input.nextInt();
				   	  
		  if(hour >=0 && hour <= 23)	   
		  {	   
			  tim.sethour(hour);		      
		  }else
		  {
			  System.out.print("you have entered invalid hour, please insert a valid hour: ");
			  hour = input.nextInt();
					   
		  }
				   
		  //to set hour
		  tim.sethour(hour);
				   
		  //if-else statement to check valid and invalid minute
		  System.out.print("please set the minute: ");
		  minute = input.nextInt();
			
		  if(minute >=1 && minute <= 59)	
		  {	  
			  tim.setminute(minute);
			  
		  }else
		  {
			  System.out.print("you have entered invalid minute, please insert a valid minute: ");
			  minute = input.nextInt();
	
		  }
				   
		  //to set minute
		  tim.setminute(minute);
				   
		  //to print white line
		  System.out.println();
				   	  
		  System.out.print("The date and time are set on:"+tim.getday()+" " + tim.getmonth());	   
		  System.out.println(", "+ tim.getyear()+" @ "+tim.gethour()+":"+tim.getminute());
				   
	  }
		
  }
	
  
  //first output
	
  /*write the date and time you wish to set 
		please set the year: 2018
		please set the month: september
		please set the day: 20
		please set the hour: 7
		please set the minute: 50
		
		The date and time are set on:20 september, 2018 @ 7:50
		
		*/
		 
  
  //second output
  /*write the date and time you wish to set 
		please set the year: 2119
		you have entered invalid year, please insert a valid year: 2018
		please set the month: jly
		you have entered invalid month, please insert a valid month: july
		please set the day: 35
		you have entered invalid day, please insert a valid day: 31
		please set the hour: 25
		you have entered invalid hour, please insert a valid hour: 12
		please set the minute:10
		
		The date and time are set on:31 july, 2018 @ 12:10

		*/










