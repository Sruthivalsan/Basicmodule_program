package cricket;
import java.util.Scanner;
public class Eligiblebowler
{
	public static void main(String[]args)
	{
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of bowlers:");
		 int n = sc.nextInt();
		 System.out.println("Enter the runs conceded by the bowlers:");
		 
		 int[] run = new int[n];
		 for(i = 0; i < n ; i ++)
		 {
			 run[i]= sc.nextInt();
		}
		 System.out.println("Enter the  balls for each bowlers :");
		 int[]  balls = new int [n];
		 for(j = 0;j < n; j ++)
		 {
			 balls[j]= sc.nextInt();
			 
		 }
		 
	}

}
