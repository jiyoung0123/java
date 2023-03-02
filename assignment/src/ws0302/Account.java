package ws0302;

import java.util.Calendar;

public class Account {
	private String accNum;
	private String accName;
	private double balance;
	private double rate;
	private String grade;
	
	public static String makeAccNum() {
		String accNum = "";
		Calendar cal = Calendar.getInstance();
		accNum = ""+cal.get(Calendar.YEAR)
		           +(cal.get(Calendar.MONTH)+1)
		           +cal.get(Calendar.DAY_OF_MONTH)
		           +cal.get(Calendar.MILLISECOND);		
		return accNum;
	}
	
	
	public Account() {
		
		this.accNum = makeAccNum();
	}
	
		
	public Account(String accName, double balance, double rate, String grade) {
		this();
		this.accName = accName;
		this.balance = balance;
		this.rate = rate;
		this.grade = grade;
	}


	public Account(String accNum, String accName, double balance) {
		this.accNum = accNum;
		this.accName = accName;
		this.balance = balance;
	}
	
	public void withdraw(double money) {
		if (money <= 0) {
			System.out.println("출금 금액을 확인 하세요!");
			return;
			}
		if(this.balance<money) {
			System.out.println("잔액이 부족합니다!");
			return;
		    }
		this.balance -= money;
	}
	
	
	public void deposit(double money) {
		if (money <= 0) {
			System.out.println("입금 금액을 확인 하세요!");
			return;
		}
		this.balance += money;

	}
	
	public double getInterest() {
		double interest = 0;
		interest = this.balance*this.rate;
		return interest;
		
	}


	public String getAccName() {
		return accName;
	}


	public void setAccName(String accName) {
		this.accName = accName;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public String getAccNum() {
		return accNum;
	}


	public double getBalance() {
		return balance;
	}


	public double getRate() {
		return rate;
	}


	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", accName=" + accName + ", balance=" + balance + ", rate=" + rate
				+ ", grade=" + grade + "]";
	}
	

		
}
