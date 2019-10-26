
  //The first Question

  /*In this question i am going to use 2 class
   * this class will have instance variable for
   * each variable */

  public class Time 
  {
	  //identify the variables and they are all private
	  private int day;
	  private String month;
	  private int year;
	  private int hour;
	  private int minute;
	  private int max =0;
	  

	  //Constructor 
	  public Time()
	  {
		  day = 0;
		  month = "  ";
		  year = 0;
		  hour = 0;
		  minute = 0;
		  
	  }
	  
	
	  //we have five Boolean sets for the variables
	  
	  //first set for day
	  public Boolean setday(int day)
	  {
		  if(day >=1 && day<= max)
		  {
			  this.day = day;
			  return true;
		  }else
		  {
			  return false;
		  }
		  
	  }
	  
	  //second set for month
	  public Boolean setmonth(String month)
	  {
		  this.month = month;
		  
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
			   break;
			  
		   }
		  return true;
	  }
	  
	 
	 //third set for year
	  public Boolean setyear(int year)
	  {
		  if(year >= 1900 && year <= 2099 )
		  {
			  this.year = year;
			  return true;  
		  }
		  else
		  {
			  return false;
		  }  
	  }
	  
	  //fourth set for hour
	  public Boolean sethour(int hour)
	  {
		  if(hour >= 0 && hour<= 23)
		  {
			  this.hour = hour;
			  return true;
		  }
		  else
		  {
			  return false; 
		  }
	  }
	  
	 //fifth set for minutes
	  public Boolean setminute(int minute)
	  {
		  if(minute >=1 && minute <=59)
		  {
			  this.minute = minute;
			  
			  return true;  
		  }
		  else
		  {
			  return false;
		  }
	  }
	  
	  
	  //we have here five gets for the variables
	 
	  public int getday()
	  {
		  return day;
		  
	  }
	  
	
	  public String getmonth()
	  {
		  return month;
		  
	  }
	  
	 
	  public int getyear()
	  {
		  return year;
		  
	  }
	  
	
	  public int gethour()
	  {
		  return hour;
		  
	  }
	  
	  public int getminute()
	  {
		  return minute;
		  
	  }
			   

  }
