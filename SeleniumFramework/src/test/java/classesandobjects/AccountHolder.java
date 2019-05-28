package classesandobjects;

public class AccountHolder {

	String firstName;
	String lastName;
	int age;
	float accountBalance;
	boolean elgibleForCreditCard;
	
	public void testEligibilityForCreditCard() 
	{
		if (age >= 25 && accountBalance >=25000) 
		
		{
			elgibleForCreditCard = true;
		}
		else
		{
			elgibleForCreditCard = false;
		}
			
		
	}
	
}
