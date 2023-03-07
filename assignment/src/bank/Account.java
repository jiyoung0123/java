package bank;

public class Account {
	private String accNo;
	private String name;
	private String accHolder;
	private double balance;

	// Constructor - 음수 예외 상황
	public Account() {

		this.accNo = MakeAccountNumber.makeAccNum();
	}

	public Account(String name, String accHolder, double balance) throws Exception {
		this();
		this.name = name;
		this.accHolder = accHolder;
		this.balance = balance;
		if(this.balance < 0) {
			throw new Exception("입금은 양수로! 돈 넣어라~");
		}
	}
		

	public Account(String accNo, String name, String accHolder, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.accHolder = accHolder;
		this.balance = balance;
	}

	// 계좌 정보 조회
	public void check() {		
		
		System.out.println("계좌번호: " +accNo +"// 계좌이름: "+ name +"// 예금주: "+ accHolder +"// 잔액: "+ balance);
	}


	// 잔액 조회
	public double getBalance() {
		return balance;
	}

	// 입금 - 음수 예외 상황,
	public void deposit(double money) throws Exception {
		if(money<0) {
			throw new Exception("입금금액은 양수만 입력 가능합니다.");
		}
		this.balance += money;		
		System.out.println("당신의 잔액은 총" + balance +"입니다.");
		
	}

	// 출금 - 잔액 부족 예외 상황, 음수 예외 상황
	public void withdraw(double money) throws Exception {
		if(money<=0) {
			throw new Exception("금액은 양수로...");}

		 else if(this.balance <= money) {
			throw new Exception("잔액부족 오류");
		}
		
		this.balance -= money;
		System.out.println("당신의 잔액은 총" + balance + "입니다");
	}

	
	
	//getter and setter
	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	
	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", accHolder=" + accHolder + ", balance=" + balance + "]";
	}
	
	
	

}
