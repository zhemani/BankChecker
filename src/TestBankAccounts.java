import java.io.*;
public class TestBankAccounts {
	 public static void main(String[] args) {
	      
	        BankAccount bacc0 = new BankAccount(0);
	        System.out.println(bacc0.toString());
	        
	        BankAccount bacc1 = new BankAccount(5000);
	        System.out.println(bacc1.toString());
	        
	        CheckingAccount chacc1 = new CheckingAccount(500.0);
	        System.out.println(chacc1.toString());
	                          
	        SavingsAccount sacc1 = new SavingsAccount(1000.0, 1.0);
	        System.out.println(sacc1.toString()); 
	        
	        // The toString methods from savings account and checking account are overriding as there is that method in bank account already
	         bacc0 = chacc1; // This was legal as the chacc1 object is a child of the bacc0 object and as a result can be referenced as so
	         System.out.println(bacc0.toString());  // Used the checking account toString as that is the type of object it still is 
	         //chacc1 = bacc1;   This was no legal as a child class cannot reference a parent class
	         BankAccount bacc2 = new CheckingAccount(200.0);
	         chacc1 = (CheckingAccount)bacc2; // Was not legal at first because child to parent so must be casted to the child class (checking)
	         //bacc1.deductFees();
	         chacc1.deductFees();
	         //sacc1.deductFees(); // This was not legal as running deductFees would be a method from a sub class to another sub class that can't happen neither can with a parent class
	         // Polymophism happens when the object referes to different types such as bacc0 which was a BankAccount object then a Checking Account object
	         // Dynamic binding, which method to be run - occured with the toString methods
	         chacc1.deposit(100.0);
	         // There is no deposit method in checking class originally so it has to be extended of bank account or it will not work 
	        
	    }
}
