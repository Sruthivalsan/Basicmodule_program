package face;

import java.io.BufferedReader;
import java.util.Scanner;

public class Main{
	
	String name;
	String address;
	String contactNumber;
	String email;
	String prooftype;
	String proofID;
	static int regID=0;
	
	
	public Main(String name,String address,String contactNumber,String email,String prooftype,String proofID)
	{
		this.name=name;
		this.address=address;
		this.contactNumber=contactNumber;
		this.email=email;
		this.prooftype=prooftype;
		this.proofID=proofID;
		
		
	}
   public static void main(String[] args) 
 {
	String name;
	String address;
	String contactNumber;
	String email;
	String prooftype;
	String proofID;
	
	/*BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	name=br.readLine();
	address=br.readLine();
	contactNumber=br.readLine();
	email=br.readLine();
	prooftype=br.readLine();
	proofID=br.readLine();*/
	
	Scanner sc=new Scanner(System.in);
	name=sc.nextLine();
	address=sc.nextLine();
	contactNumber=sc.nextLine();
	email=sc.nextLine();
	prooftype=sc.nextLine();
	 proofID=sc.nextLine();
	Main customer=new Main(name,address,contactNumber,email,prooftype,proofID);
	//Main customer1=new Main(name,address,contactNumber,email,prooftype,proofID);
	customer.register(name,address,contactNumber,email,prooftype,proofID);
			
 }
   void register(String name,String address,String contactNumber,String email,String prooftype,String proofID)
   {
	   
	   System.out.println(this.name);
	   System.out.println(this.address);
	   System.out.println(this.contactNumber);
	   System.out.println(this.email);
	   System.out.println(this.prooftype);
	   System.out.println(this.proofID);
	   System.out.println("your registration ID is:"+ ++regID);
	   
	   
	   
	   
	   }
   }
