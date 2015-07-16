
public class SavingsAccount extends BankAccount {
	private double interestRate;

	public SavingsAccount (double initialAmount, double rate) {
		super (initialAmount);
		interestRate = rate;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public void calculateInterest() {
		double balance = super.getBalance();
	    balance = (balance * interestRate);
	    super.deposit(balance);
	}
	
	 public String toString(){
	      return ("SavingsAccount: balance $" + super.getBalance() + ", interestRate " + interestRate);
	    } 
}

// If the interestRate were fixed then the private attribute interestRate would be a FINAL variable.
//Also the constructor would not take the rate parameter as there would be no need to change the interest rate
