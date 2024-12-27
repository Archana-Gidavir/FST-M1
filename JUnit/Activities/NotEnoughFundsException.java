package session4;

public class NotEnoughFundsException extends RuntimeException 
{
    public NotEnoughFundsException(Integer amount, Integer balance) 
    {
    	System.out.println("NotEnoughFundsException - Attempted to withdraw " + amount + " with a balance of " + balance);	
    }
}
