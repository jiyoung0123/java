package bank;

public class Account {
	private int accNo;
	private String name;
	private String accHolder;
	private double balance;
	// Constructor - 음수 예외 상황

	public Account() {
	}

	public Account(int accNo, String name, String accHolder, double balance) throws NegativeNumber {
		if (balance < 0) {
			throw new NegativeNumber("음수입니다.");
		}
		this.accNo = accNo;
		this.name = name;
		this.accHolder = accHolder;
		this.balance = balance;
	}

	// 계좌 정보 조회
	public String getAccInfo() {
		return "계좌번호는 :"+ accNo + " 이름은 :" + name + " 소유주는 :" + accHolder;
	}

	// 잔액 조회
	public double getBalance() {
		return balance;
	}

	// 입금 - 음수 예외 상황
	public double deposit(double a) throws NegativeNumber {
		double result = a + balance;
		if (a < 0) {
			throw new NegativeNumber("음수입니다.");
		}
		return result;
	}

	// 출금 - 잔액 부족 예외 상황, 음수 예외 상황
	public double widthrow(double a) throws NegativeNumber {
		double result = balance - a;
		if (a > balance) {
			throw new NegativeNumber("잔액이 부족합니다.");
		}else if (a < 0) {
			throw new NegativeNumber("음수입니다.");
		}
		return result;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", accHolder=" + accHolder + ", balance=" + balance + "]";
	}

}
