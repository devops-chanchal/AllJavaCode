package feb;

public class SilverSavingAccount extends SavingAccount {  //multilevel inheritance
	String specialOfferId;
	
	
	public void customerSpecialOffer() 
	{
		
		System.out.println("This method is in SilverSavingAccount class");
		
	}
	
	public static void main(String[] args) {
		
		 SilverSavingAccount cust1=new SilverSavingAccount();                            //child 
		cust1.accountId="123";
		cust1.acctBalance=1000;
		cust1.interestRate=10;
		cust1.minimumBalance=100;
		cust1.specialOfferId="two";
	cust1.customerSpecialOffer();
	cust1.customerAccountType();
	cust1.customerName();
		
		
		
		
		System.out.println("account id is "+cust1.accountId);
	}


}
