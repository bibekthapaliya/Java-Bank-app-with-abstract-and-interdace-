package BankAccountApp;

public class Saving extends Account{
	//List properties specific to the savaing account
		private int safteyDepositBoxId;
		private int safteyDepositBoxKey;
		
	
	//Constructor for setting the properties
	
	public Saving(String name,String sSN,double initDeposit) {
		super(name,sSN,initDeposit);
		accountNumber= "1"+ accountNumber;
		setSafteyDepositBox();
	}
	
	@Override
	public void setRate() {
		rate=getIRate() - .25;
		
	}
	
	
	
	private void setSafteyDepositBox() {
		safteyDepositBoxId =(int)( Math.random()*Math.pow(10, 3));
		safteyDepositBoxKey = (int)((Math.random())* Math.pow(10, 4));
		System.out.println(safteyDepositBoxId);
		
	}
	
	//List any methods specific to saving account
	public void showInfo() {
		super.showInfo();
		System.out.println("Your Saving Account Features" +
		"\n Saftey Deposit Box Id :" + safteyDepositBoxId +
		"\n Saftey Deposit Box Key:" + safteyDepositBoxKey);
		
		
	}
	
	

}
