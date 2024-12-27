package session4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Activity2 
{
	@Test
	void notEnoughFunds()
	{
		BankAccount account = new BankAccount(9);
		
		System.out.println("created new account with amount 9");
		
		Assertions.assertThrows(NotEnoughFundsException.class, () -> account.withdraw(10),
                "Balance must be greater than amount of withdrawal");
	}

	
	@Test
	void enoughFunds()
	{
		BankAccount account = new BankAccount(100);
		
		System.out.println("created new account with amount 100");
		
		Assertions.assertDoesNotThrow(() -> account.withdraw(10));
		
	}

}
