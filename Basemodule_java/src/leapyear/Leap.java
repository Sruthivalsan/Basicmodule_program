package leapyear;
import java.util.Scanner;
public class Leap 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter a yearr:");
		  int n = sc.nextInt();
		  int status = 0;
		  if(n % 400 == 0)
		  {
			status = 1;  
			  
		  }
		  else if(n % 100 == 0)
		  {
			  status = 0;
		  }
		  else if(n % 4 == 0)
		  {
			  status = 1;  
		  }
		  
		  if(status == 1)
		  {
			  System.out.println("It is a leap year");
			  
		  }
		  else
		  {
			  System.out.println("It is not a leap year"); 
		  }
		  
		  }
	}

