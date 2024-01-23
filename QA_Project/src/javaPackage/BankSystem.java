package javaPackage;

public class BankSystem {
    
	BankSystem(String name, String pass)
	{
	System.out.println(name+ " " + pass);	
	}

	int amt= 1000;
	void deposit(int dep)
	{
		amt+=dep;
		
		System.out.println("This is the current balance after deposit " +amt);
	}
	void withdraw(int wt)
	{
		amt=amt-wt;
		
		System.out.println("This is the current balance after withdrwa " +amt);
	}
	int display()
	{
		
		return amt;
	}
	public static void main(String[] args) {
		// Create a object of class
		BankSystem a = new BankSystem("amal12","1234");
		a.deposit (1000);
		a.withdraw (500);
		a.display();
		System.out.println(a.display());
		

	}
	
}
