package BankAccountApp;

public interface IRate {

	//Write a method that returns the base rate
	default double getIRate() {
		return 2.5;
	}
	
}
