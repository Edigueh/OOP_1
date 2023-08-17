
public class BankAccount {
	
	public int numConta;
	protected String type;
	private String owner;
	private float balance;
	private boolean status;
	//Attributes
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	//numConta
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	//type
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	//owner
	
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	//balance
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	//status
	public void getStatus() {
		System.out.println("Balance: "+this.getBalance());
		System.out.println("Account Number: "+this.getNumConta());
		System.out.println("Owner: "+this.getOwner());
		System.out.println("Type: "+this.getType());
		System.out.println("Status: "+ this.isStatus());
	}
	
	public BankAccount() {
		super();
		this.setBalance(0);
		this.setStatus(false);

	}
	
	public void openAccount(String type,float balance) {
		if(this.isStatus()== false) {
			this.setStatus(true);
			if(type == "CC") {
				this.setBalance(balance+50);
				this.setType(type);
			}else if(type == "CP") {
				this.setBalance(balance+150);
				this.setType(type);
			}
		}else {
			System.out.println("Conta já está aberta");
		}
	}
	
	public void closeAccount() {
		
		if(this.isStatus()) {
			if(this.balance>0) {
				System.out.println("Conta possui dinheiro, favor retirar");
			}else if(this.balance<0) {
				System.out.println("Conta em débito, favor acertar!");
			}else {
				this.setNumConta(0);
				this.setOwner(null);
				this.setStatus(false);
				this.setType(null);
				System.out.println("Conta encerrada");
			}
		}else{
			System.out.println("Conta não está aberta");
		}
	}
	
	public void deposit(float amount) {
		if(this.isStatus()) {
			this.setBalance(this.balance+amount);
		}else {
			System.out.println("Não foi possível depositar");
		}
		
	}
	
	public void withdraw(float amount) {
		if(this.isStatus()) {
		
			if(this.balance < amount) {
				System.out.println("Saldo Insuficiente");
			}else {
				this.setBalance(this.balance-amount);
			}
		}else {
			System.out.println("Não foi possível sacar");
		}
	}
	
	public void payMonthly() {
		int ccTax = 12;
		int cpTax = 20;
		if(this.getType()=="CC") {
			if(this.getBalance()>=ccTax) {
				this.setBalance(this.getBalance()-ccTax);
			}else {
				System.out.println("Saldo insuficiente para pagar mensalidade!");
			}
		}else if(this.getType()=="CP") {
			if(this.getBalance()>=cpTax) {
				this.setBalance(this.getBalance()-cpTax);
			}else {
				System.out.println("Saldo insuficiente para pagar mensalidade!");
			}
		}
	}
	

}
