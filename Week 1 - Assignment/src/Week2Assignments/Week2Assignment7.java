package Week2Assignments;

public class Week2Assignment7 {
	
	public static void main(String [] args)
	
		{
		
			MasterBank masterBank = new MasterBank();
			BankA bankA = new BankA();
			BankB bankB = new BankB();
			BankC bankC = new BankC();
			
			System.out.println("Interest Rate of Master Bank is "+masterBank.interestRate(0)+ "%");
		
			System.out.println("Interest Rate of Bank A is "+bankA.interestRate(8)+ "%");
			
			System.out.println("Interest Rate of Bank B is "+bankB.interestRate(9)+ "%");
			
			System.out.println("Interest Rate of Bank C is "+bankC.interestRate(10)+ "%");
		}
	
}
