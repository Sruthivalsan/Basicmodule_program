package casestudy4;

import java.io.IOException;
import java.util.Scanner;

public class Customeregistration 
{ 
	

	public static String[] name= new String[50];       
	String addres;
	String contactnumber;
	String emailid;
	String prooftype;
	String proofID;
	static int  ID = 0;


	public static void main(String args []) throws IOException
	{
	  //String[] name= new String[50];    
		//String[] name;
		String addres;
		String contactnumber;
		String emailid;
		String prooftype;
		String proofID;
		int registration;
		String proceed;
		
		
		Scanner sc=new Scanner(System.in);
		
		
			do
			{	
				ID ++;
				System.out.println("Enter your name:");
				name[ID] = sc.nextLine();
				//System.out.println(name[ID]);
				System.out.println("Enter your addres:");
				addres = sc.nextLine();
				System.out.println("Enter your  contactnumber:");
				contactnumber = sc.nextLine();
				sc.nextLine();
				System.out.println("Enter youremailid:");
				emailid = sc.nextLine();
				System.out.println("Enter your prooftype:");
				prooftype = sc.nextLine();
				
				System.out.println("Enter your proofID:");
				proofID = sc.nextLine();
				System.out.println("****THANK YOU FOR REGISTERING**Your id is: " +ID);
				System.out.println("Do you want to continue registration (y/n)?");
				proceed = sc.nextLine();
				
				}
				while(proceed.equalsIgnoreCase("Y"));
			
			
			System.out.println("***Customers list**");
			System.out.println("The registered customers are:");
			System.out.println("customerID: name:");
			for(int i = 1;  i <=ID; i ++)
			{
				System.out.println(+i+"\t    "+name[i]);
				
			}
			
			
			
		
		
			
		}

}