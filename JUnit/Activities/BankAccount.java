package session4;

public class BankAccount 
{
	    private Integer balance;
	    
	    // Create a constructor
	    public BankAccount(Integer initialBalance) 
	    {
	        balance = initialBalance;
	    }

	    // Add method to calculate balance amount after withdrawal
	    public Integer withdraw(Integer amount) 
	    {
	    	System.out.println("account balance - " + balance);
	    	System.out.println("amount to withdraw - " + amount);
	    	
	        if (balance < amount) 
	        {
	        	System.out.println("Balance must be greater than amount of withdrawal");
	            throw new NotEnoughFundsException(amount, balance);
	        }
	        
	        balance -= amount;
	        
	        System.out.println("after withdrawal account balance - " + balance);
	        
	        return balance;
	    }

}
