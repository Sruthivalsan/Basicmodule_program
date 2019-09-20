package fibnocciseries;
import java.util.Scanner;

public class Fibno 
{
	public static void main(String[]args)
	{
		int f=0,s=0,t=1,i;
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter a number:");
		  int n = sc.nextInt();
		  for(i = 0; i < n; i++)
		  {
			  f = s;
			  s = t;
			  t = s + f;
			  System.out.println( f+ " ");
		  }
		  
	}

}
