package BankAccountApp;

import java.util.List;

public class BankAccountApp {
	public static void main(String[]args)
	
	{
		/*Checking  check1 = new Checking("Bibek Thapliya","321456789",1500);
		Saving savacc1 = new Saving("Rich Lowe","444555666",2500);
			
	
		savacc1.compound();
		savacc1.showInfo();
		System.out.println("*************");
		check1.showInfo();
		savacc1.deposit(5000);
		savacc1.withdraw(200);
		savacc1.transfer("Sunita", 500);
		*/
		
		String file = "‪C:\\Users\\Bibek\\Desktop\\BankAccount.csv";
		
		List<String []> newCustomers = utilities.CSV.read(file);
		for(String[] accountHolder:newCustomers) {
			System.out.println("New Customer");
			System.out.println(accountHolder[0]);
			System.out.println(accountHolder[1]);
			System.out.println(accountHolder[2]);
			System.out.println(accountHolder[3]);
		}
		
		
	}
}
