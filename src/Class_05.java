
public class Class_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount Andre = new BankAccount();
		String owner = Andre.getOwner();
		
		Andre.openAccount("CP", 850);
		Andre.deposit(2301.38f);
		Andre.payMonthly();
		Andre.setType("CC");
		Andre.withdraw(3000f);
		Andre.closeAccount();
		Andre.getStatus();
		
		
	}

}
