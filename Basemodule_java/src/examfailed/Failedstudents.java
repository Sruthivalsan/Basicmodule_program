package examfailed;
import java.util.Scanner;

public class Failedstudents
{
  public static void main(String[] args)
  {
	  Scanner sc = new Scanner(System.in);
	  int i,j,count=0;
	  System.out.println("Enter the number of students:");
	  int n = sc.nextInt();
	  System.out.println("Enter the mark of student:");
	  int[] mark = new int[n];
	  for(i = 0; i < n; i ++) 
	  {
		  mark[i] = sc.nextInt();
	  }
	  for(j = 0; j < n; j ++) 
	  {
		  if(mark[j] <= 41)
		  {
			  count ++;
		  }
	  }
	  System.out.println("Number of students appearing for retest is:" +count);
  }
	
	
}
