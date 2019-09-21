package casestudy3;

import java.util.Scanner;

public class Registration 

{
	String name;
	String addres;
	String contactnumber;
	String emailid;
	String liscenceno;
	String proofID;
	
	
	public static void main(String args [])
	{
		String name;
		String addres;
		String contactnumber;
		String emailid;
		String liscenceno;
		String proofID;
		int registration;
		String proceed;
		Scanner sc=new Scanner(System.in);
		
		
		do
		{	
			System.out.println("Enter your name:");
			name = sc.nextLine();
			System.out.println("Enter your addres:");
			addres = sc.nextLine();
			System.out.println("Enter your  contactnumber:");
			contactnumber = sc.nextLine();
			sc.nextLine();
			System.out.println("Enter youremailid:");
			emailid = sc.nextLine();
			System.out.println("Enter your liscenceno:");
			liscenceno = sc.nextLine();
			
			System.out.println("Enter your proofID:");
			proofID = sc.nextLine();
			System.out.println("****THANK YOU FOR REGISTERING***");
			System.out.println("DO YOU WANT TO CONTINUE:(Yes/No)");
			proceed = sc.nextLine();
		}
			while(proceed.equalsIgnoreCase("Y"));
		System.out.println("DO YOU WANT TO UPDATE YOUR EMAILID:(Y/N)");
		proceed = sc.nextLine();
		
		while(proceed.equalsIgnoreCase("Y"))
		{
			System.out.println("UPDATE EMAILID");
			System.out.println("Enter your new emailid:");
			emailid = sc.nextLine();
			System.out.println("UPDATE  YOUR EMAILId ");
			System.out.println("YOUR DETAILS ARE:" +name);
			System.out.println(":" +addres);
			System.out.println(":" +contactnumber);
			System.out.println(":" +emailid);
			System.out.println(":" +liscenceno);
			System.out.println(":" +proofID);
			System.exit(0);
			
		}
		
			
		
			
			
		
		
		
		
		
		
		
		
	}

}
