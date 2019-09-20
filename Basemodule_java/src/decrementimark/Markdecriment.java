package decrementimark;
import  java.util.Scanner;

public class Markdecriment 
{
 public static void main (String []args)
 {
	Scanner sc = new Scanner(System.in);
	int i,j;
	System.out.println("Enter the number of students:");
	int n= sc.nextInt();
	System.out.println("enter the mark of students:");
	int[] a = new int[20];
	for(i = 0; i < n; i ++)
	{
	a[i] = sc.nextInt();	
		
	}
	System.out.println("The priority of marks is:");
	for(i = 0; i < n ; i ++)
	{
		for(j = i+1;j < n ; j++)
		{
			if(a[i] < a[j])
			{
				int temp = a[i];
				a[i]= a[j];
				a[j]=temp;
			}
		}
		
	}
	
	for(i = 0; i < n; i ++)
	{
		System.out.println(a[i]);
	}
 }
 
	

}

