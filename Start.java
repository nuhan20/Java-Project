import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		SavingsAccount sa1 = new SavingsAccount();
		sa1.setAccountNumber("176353");
		sa1.setBalance(45000.0);
		sa1.setInterestRate(2.5);
		
		FixedAccount fa1 = new FixedAccount();
		fa1.setAccountNumber("174357");
		fa1.setBalance(150000.0);
		fa1.setTenureYear(5);
		
		SavingsAccount sa2 = new SavingsAccount("276308", 25000.0, 1.5);
		FixedAccount fa2 = new FixedAccount("234357", 350000.0, 5);
		
		System.out.println("Account Number: "+sa1.getAccountNumber());
		System.out.println("Account Balance: "+sa1.getBalance());
		System.out.println("Interest Rate: "+sa1.getInterestRate());
		
		System.out.println("---------------------------");
		System.out.println("---------------------------");
		
		sa2.showDetails();
		
		System.out.println("---------------------------");
		System.out.println("---------------------------");
		System.out.println("Account Number: "+fa1.getAccountNumber());
		System.out.println("Account Balance: "+fa1.getBalance());
		System.out.println("Tenure Year: "+fa1.getTenureYear());
		
		System.out.println("---------------------------");
		System.out.println("---------------------------");
		
		fa2.showDetails();
		
		System.out.println("---------------------------");
		System.out.println("---------------------------");
		
		Customer c1 = new Customer();
		c1.setNid(134567);
		c1.setName("Moyuri");
		c1.setSavingsAccount(sa1);
		c1.setFixedAccount(fa1);
		
		
		Customer c2 = new Customer();
		c2.setNid(134568);
		c2.setName("Digonto");
		c2.setSavingsAccount(sa2);
		c2.setFixedAccount(fa2);
		
		
		
		System.out.println("Customer Nid: "+c1.getNid());
		System.out.println("Customer Name: "+c1.getName());
		System.out.println("---------------------------");
		System.out.println("---------------------------");
		System.out.println("Customer Savings Account Number: "+c1.getSavingsAccount().getAccountNumber());
		System.out.println("Customer Savings Account Balance: "+c1.getSavingsAccount().getBalance());
		System.out.println("Customer Savings Account Interest Rate: "+c1.getSavingsAccount().getInterestRate());
		System.out.println("---------------------------");
		System.out.println("---------------------------");
		System.out.println("Customer Fixed Account Number: "+c1.getFixedAccount().getAccountNumber());
		System.out.println("Customer Fixed Account Balance: "+c1.getFixedAccount().getBalance());
		System.out.println("Customer Fixed Account Tenure Year: "+c1.getFixedAccount().getTenureYear());
		
		System.out.println();
		System.out.println("Customer Nid: "+c2.getNid());
		System.out.println("Customer Name: "+c2.getName());
		System.out.println("---------------------------");
		System.out.println("---------------------------");
		
		c2.getSavingsAccount().showDetails();
		System.out.println("---------------------------");
		System.out.println("---------------------------");
		c2.getFixedAccount().showDetails();
		
		
		
		
		
		
	}
}