package bank;

public class AxisBank extends BankInfo{
	
	public void deposit()
	{
		System.out.println("400");
	}

	public static void main(String[] args) {
		 
		AxisBank ab=new AxisBank();
		ab.deposit();
		ab.fixed();
		ab.saving();

	}

}
