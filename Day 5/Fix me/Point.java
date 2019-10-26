import java.util.Scanner;
import java.math.*;
public class Point {

	int x ;
	int y ; 
	int z ;
	
	public Point(int x , int y , int z)
	{
		x = x ;
		y = y ;
		z = z ;
	}
	
	public void setX(int x)
	{
		x = x ;		
	}
	public void setY(int y)
	{
		y = y ;		
	}
	
	public void setZ(int z)
	{
		z = z ;		
	}
	
	int getX(int x){
		return x;
	}
	int getY(){
		return y;
	}
	void getZ(){
		
	}
	
	
	public void negate()
	{
		x = -x;
		y = -y;
		z = -z;
	}
	
	
	public void print()
	{
		System.out.printf("your point is (%d , %d , %d)\n",x,y,z);
	}
	
	public float norm(){
		float d  = (float) Math.sqrt(x*x + y*y + z*z);
		return d;
	}
}
