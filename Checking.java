package BankAccountApp;

public class Checking extends Account{
	

	//List properties specific to a checking account
	private int debitCardNumber;
	private int debitCardPin;
	
	//Constructor to initialize checking account properties
		
		public Checking(String name, String sSN, double initDeposit) {
			// TODO Auto-generated constructor stub
			super(name,sSN,initDeposit);
			accountNumber= "2" + accountNumber;
			setDebitCard();
		}
		
		@Override
		public void setRate() {
			rate=getIRate()* .15;
			System.out.println("Implement rate for checking ");
		}
		
		private void setDebitCard() {
			debitCardNumber = (int)(Math.random()*Math.pow(10,12));
			debitCardPin = (int)(Math.random()* Math.pow(10, 4));
		}
		
		
		public void showInfo() {
			super.showInfo();
			System.out.println("Your Cheking Account Features" + 
			"\n DebitCard Number:"+ this.debitCardNumber+
			"\n Debit Card Pin:" + this.debitCardPin);
			
				}
}
