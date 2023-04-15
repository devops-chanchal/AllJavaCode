package feb;

public class AbstractBankC extends AbstarctBank{

	@Override
	public void debitAmount() {
		System.out.println("Your amount is debited 20 $");
		
	}
	public static void main(String[] args) {
		AbstractBankC obj=new AbstractBankC();
		obj.debitAmount();
	}
	
	
	
	
	
	
	

}
