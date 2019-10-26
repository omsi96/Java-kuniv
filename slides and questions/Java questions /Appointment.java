
  
  import java.util.Calendar;
  
  /*This program will sets appointments for users 
   * for specific venue and its make sure 
   * that the entered date is in the future*/
  
  public class Appointment 
  {
	  private String venue;
	  private Time time = new Time();
	  
	  public Appointment()
	  {
		  time.sethour(12);
		  time.setminute(0);
		  venue ="work";
	  }
	  public void setvenue(String venue)
	  {
		  this.venue =venue;
	  }
	  

	  public String getvenue()
	  {
		  return venue;
		  
	  }
	  
	
	
		  
	  


  }
