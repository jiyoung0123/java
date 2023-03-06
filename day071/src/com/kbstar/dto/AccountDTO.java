package com.kbstar.dto;

//이 class에 의해서 Account라는 계좌 객체가 생성됨
public class AccountDTO {

	private String accNum;
	private String accName;
	private double balance;

	
	//계좌번호를 생성하는 로직은 굉장히 복잡, 그러니, 계좌번호 생성하는 class를 만들어서 가져다가 쓰자
	public AccountDTO() {	
		
		
	}


	public AccountDTO(String accNum, String accName, double balance) {
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

	// 현재 내 계좌의 잔액을 조회할 수 있다.
	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", accName=" + accName + ", balance=" + balance + "]";
	}

}
