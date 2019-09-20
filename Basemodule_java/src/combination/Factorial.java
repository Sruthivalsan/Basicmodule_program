package combination;
import java.util.Scanner;


public class Factorial
{
  public static void main(String[]args)
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the number alphabets in your name:");
	  int n = sc.nextInt();
	  int i ,fact=1;
	  for(i = 1; i <= n; i ++)
	  {
		  fact = fact * i ;
	  }
	  System.out.println("The number of combination is:" +fact);
	  
  }
}
